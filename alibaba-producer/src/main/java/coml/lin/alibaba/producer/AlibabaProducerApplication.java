package coml.lin.alibaba.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务提供者
 * @author lin
 * @date 2022/4/10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaProducerApplication.class, args);
    }

}
