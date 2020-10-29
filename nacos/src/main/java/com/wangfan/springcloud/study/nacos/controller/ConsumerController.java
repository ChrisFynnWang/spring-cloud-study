package com.wangfan.springcloud.study.nacos.controller;

import com.wangfan.springcloud.study.nacos.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/10/24 12:16
 */
@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/hi-resttemplate")
    public String hiResttemplate(@RequestParam("name") String name) {
        return restTemplate.getForObject("http://nacos-provider/hi?name=" + name, String.class);
    }

    @GetMapping("/hi-feign")
    public String hiFeign() {
        return providerClient.hi("feign");
    }

    @GetMapping("/name-feign")
    public String nameFeign() {
        return providerClient.name();
    }

}
