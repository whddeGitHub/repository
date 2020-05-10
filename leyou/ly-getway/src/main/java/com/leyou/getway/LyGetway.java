package com.leyou.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description TODO
 * @Author whd
 * @Date 2020/5/10 14:12
 */
@EnableZuulProxy
@SpringCloudApplication
public class LyGetway {
    public static void main(String[] args) {
        SpringApplication.run(LyGetway.class);
    }
}
