package com.joydigit.mirror_processor.biz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.joydigit.mirror_processor.entity.*;
import com.joydigit.mirror_processor.mapper.CustomerInfoMapper;
import com.joydigit.mirror_processor.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by 75442 on 2019/11/28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MirrorBiz {
    private final Logger log = LoggerFactory.getLogger(MirrorBiz.class);

    @Value("${wecaring.host}")
    private String WECARING_HOST;

    @Autowired
    private CustomerInfoMapper _customerInfoMapper;

    private static final String WECARING_API = "/api/healthservice/health-api/jwt/physical/receivePhysicalData";

    /**
     * 根据体检id查询体检详情
     * @param id
     * @return
     */
    public String getExamDetailed(String id){
        String url = "http://mirror.laikang.com/api/inspectionmirror/public/exam/queryexamdetailedbyexamuuid/" + id;
        return HttpUtils.get(url);
    }

    /**
     * 将检测数据推送到运营平台
     */
    public void pushToWeCaring(String jsonData){
        String wecaringURL = WECARING_HOST + WECARING_API;
        MirrorExamModel mirrorExamModel = JSON.parseObject(jsonData, MirrorExamModel.class);
        Map params = new HashMap();
        params.put("data",getHealthDataJSON(mirrorExamModel));
        log.info((String) params.get("data"));
        String sendResult = HttpUtils.post(wecaringURL, params);
        log.info("push records:"+params.size()+" response:"+sendResult);


    }

    public String getHealthDataJSON(MirrorExamModel examModel){
        JSONArray healthDataList = new JSONArray();
        JSONObject healthData = new JSONObject();
        JSONObject customerInfo = new JSONObject();
        JSONArray physicalList = new JSONArray();
        //
        // 获取customerID 和 projectID
        CustomerInfo customerInfoVo = _customerInfoMapper.selectCustomerIdAndProjectIdBydDevice(examModel.getBody().get(0).getExam_sourcecode());
        //
        customerInfo.put("CustomerId",parseString(customerInfoVo.getCustomerId()));
        customerInfo.put("ProjectId", parseString(customerInfoVo.getProjectId()));
        WeCaringVo weCaring = new WeCaringVo();
        weCaring.setExam_diseasename(examModel.getBody().get(0).getExam_diseasename()); //分析结果
        weCaring.setExam_conclusion(examModel.getBody().get(0).getExam_conclusion()); //分析结果详情
        weCaring.setExamEvaluation(examModel.getBody().get(0).getExam_evaluation()); // 分数
        List<Devices> devices = examModel.getBody().get(0).getDevices();
        for (Devices device: devices){
            List<Items> items = device.getItems();
            for (Items item : items){
                if (item.getIndi_name().equals("局部特征")){
                    weCaring.setFaceFeature(item.getItem_value());
                }
                if (item.getIndi_name().equals("光泽")){
                    weCaring.setReflet(item.getItem_value());
                }
                if (item.getIndi_name().equals("面色")){
                    weCaring.setComplexion(item.getItem_value());
                }
                if (item.getIndi_name().equals("唇色")){
                    weCaring.setLipColor(item.getItem_value());
                }
                if (item.getIndi_name().equals("舌色")){
                    weCaring.setTongueColor(item.getItem_value());
                }
                if (item.getIndi_name().equals("舌形")){
                    weCaring.setTongueFurShape(item.getItem_value());
                }
                if (item.getIndi_name().equals("苔色")){
                    weCaring.setTongueFurColor(item.getItem_value());
                }
                if (item.getIndi_name().equals("舌苔形质")){
                    weCaring.setTongueFurShape(item.getItem_value());
                }

            }
        }
        //physicalList.add(getPhysicalItem(healthDataMap,new String[]{"Breath","Bed","Warn","Heartrate1","Turn"}));
        physicalList.add(weCaring);
        healthData.put("customerInfo",customerInfo);
        healthData.put("physicalList",physicalList);
        healthData.put("deviceId","6"); //设备名: 6-中医镜
        healthData.put("physicalTime",parseString(examModel.getBody().get(0).getExam_time())); //physical_time
        healthDataList.add(healthData);
        String result = JSON.toJSONString(healthDataList, SerializerFeature.DisableCircularReferenceDetect);
        return result;
    }

    private String parseString(Object obj){
        return (obj==null)?"":obj.toString().trim();
    }

    private JSONObject getPhysicalItem(Map dataMap,String[] keys){
        JSONObject jsonObject = new JSONObject();
        for(String key:keys) {
            jsonObject.put(key,parseString(dataMap.get(key)));
        }
        return jsonObject;
    }

}
