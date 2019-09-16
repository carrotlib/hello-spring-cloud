package com.antoniopeng.hello.spring.cloud.consumer.service.hystrix;

import com.antoniopeng.hello.spring.cloud.consumer.service.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceHystrix implements ProviderService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
