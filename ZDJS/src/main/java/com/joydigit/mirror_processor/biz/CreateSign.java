package com.joydigit.mirror_processor.biz;

import java.time.Year;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/**
 * @Description TODO
 * @Author whd
 * @Date 2019/12/23 16:55
 */
public class CreateSign {
    public static String encodeSign(SortedMap<String,Object> parameters, String key){
        StringBuffer sbKey = new StringBuffer();
        Set<Map.Entry<String, Object>> set = parameters.entrySet();///所有参与传参的参数按照accsii排序（升序）
        Iterator<Map.Entry<String, Object>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> next = iterator.next();
            String k  = next.getKey();
            Object v = next.getValue();
            //空值不传递，不参与签名组串
            if (null != v && !"".equals(v)){
                sbKey.append(k + "=" + v + "&");
            }
        }
        sbKey=sbKey.append("key="+key);
        System.out.println("字符串:"+sbKey.toString());
        //MD5加密,结果转换为大写字符
        String sign = MD5Util.MD5Encode(sbKey.toString(), "UTF-8").toUpperCase();
        return "签名:"+sign+"/签名";
    }
}
