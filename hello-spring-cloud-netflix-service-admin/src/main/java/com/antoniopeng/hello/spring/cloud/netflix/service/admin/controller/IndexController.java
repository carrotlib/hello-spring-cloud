package com.antoniopeng.hello.spring.cloud.netflix.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String index() {
        return "port : " + port;
    }

    @RequestMapping(value = "hi")
    public String sayHi(String message) {
        return "port : " + port + "，message : " + message;
    }

}
