package com.joydigit.mirror_processor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.joydigit.mirror_processor.mapper")
public class MirrorProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MirrorProcessorApplication.class, args);
    }

}
