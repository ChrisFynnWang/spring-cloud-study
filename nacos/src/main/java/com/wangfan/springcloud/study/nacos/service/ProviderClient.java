package com.wangfan.springcloud.study.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/10/24 12:21
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("hi")
    String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name);

    @GetMapping("name")
    String name();
}
