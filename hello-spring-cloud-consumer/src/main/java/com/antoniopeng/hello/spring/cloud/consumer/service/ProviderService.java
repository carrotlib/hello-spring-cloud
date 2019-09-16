package com.antoniopeng.hello.spring.cloud.consumer.service;

import com.antoniopeng.hello.spring.cloud.consumer.service.hystrix.ProviderServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-provider", fallback = ProviderServiceHystrix.class)
public interface ProviderService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("message") String message);

}