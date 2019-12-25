package com.joydigit.mirror_processor.biz;

import lombok.Data;
import org.apache.commons.lang.StringUtils;

import java.security.MessageDigest;
import java.util.*;

/**
 * @Description TODO
 * @Author whd
 * @Date 2019/12/23 16:03
 */
@Data
public class Sign {
    public static void main(String[] args) {
        SortedMap<String,Object> parameters = new TreeMap<String,Object>(); //TreeMap 中的key按照accsii码进行排序
        String appId="YunPeng20000000164";
        String phone="13811992211";
//        String username = "kalint";
//        String cardNo = "32343244";
//        String faceUrl = "https://pic2.zhimg.com/v2-4f46b6358bf5182916b3f1c5c39b1641_r.jpg";
        String key="a2c0cb8629ad1904aa0f93c706a316d0";
        Integer page = new Integer(1);
        parameters.put("appId", appId);
        parameters.put("phone", phone);
//        parameters.put("username", username);
//        parameters.put("cardNo", cardNo);
//        parameters.put("faceUrl", faceUrl);
        parameters.put("page",page);
        String mySign = CreateSign.encodeSign(parameters,key);
        System.out.println(mySign);

    }
}
