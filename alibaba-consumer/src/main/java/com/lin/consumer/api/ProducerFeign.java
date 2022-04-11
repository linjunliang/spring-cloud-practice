package com.lin.consumer.api;

import com.lin.vo.BaseVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * 服务提供者Feign
 *
 * @author: lin
 * @date: 2022/4/10
 */
@FeignClient("practice-producer")
public interface ProducerFeign {

    /**
     * feign 调用服务消费
     * @param id
     * @return
     */
    @GetMapping("/lin/producer/produce/{id}")
    BaseVo producer(@PathVariable Integer id);
}
