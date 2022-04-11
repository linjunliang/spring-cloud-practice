package com.lin.consumer.controller;

import com.lin.consumer.api.ProviderFeign;
import com.lin.vo.BaseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务消费者Controller
 *
 * @author: lin
 * @date: 2022/4/10
 */
@RestController
@RequestMapping("/lin/consumer")
public class ConsumerController {

    @Resource
    private ProviderFeign providerFeign;

    @GetMapping("/consume/{id}")
    public BaseVo consume(@PathVariable Integer id){
        BaseVo result = providerFeign.provide(id);
        return result;
    }
}
