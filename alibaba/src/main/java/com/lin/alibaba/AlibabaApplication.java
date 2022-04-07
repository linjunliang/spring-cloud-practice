package com.lin.alibaba;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "practice-nacos", autoRefreshed = true)
public class AlibabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaApplication.class, args);
    }

}
