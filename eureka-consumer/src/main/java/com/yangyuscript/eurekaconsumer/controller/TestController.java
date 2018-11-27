package com.yangyuscript.eurekaconsumer.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getServiceOne")
    public String getServiceOne(){
        return "this is get from provider :"+restTemplate.getForObject("http://service-provider/serviceOne",String.class);
    }
}
