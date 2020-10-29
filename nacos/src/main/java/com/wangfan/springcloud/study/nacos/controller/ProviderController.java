package com.wangfan.springcloud.study.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/10/24 12:15
 */
@RestController
@RefreshScope
public class ProviderController {

    @Value("${usernames}")
    private String username;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name) {
        return "hi " + name;
    }

    @GetMapping("/name")
    public String getName() {
        return username;
    }
}
