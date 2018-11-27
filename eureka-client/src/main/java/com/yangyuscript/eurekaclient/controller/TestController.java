package com.yangyuscript.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/serviceOne")
    public String serviceOne(){
        return "serviceOne";
    }


}
