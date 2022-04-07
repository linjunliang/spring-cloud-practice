package com.lin.alibaba.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("config")
public class ConfigController {

    @NacosValue(value = "${spring.application.name}", autoRefreshed = true)
    private String appName;

    @GetMapping(value = "/get")
    @ResponseBody
    public String get() {
        return appName;
    }
}
