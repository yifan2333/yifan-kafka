package com.yifan.controller;

import javax.annotation.Resource;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;


    @GetMapping("send")
    public String send() {
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send("wuyifan-topic-9", "哈哈" + i);
//            kafkaTemplate.send("wuyifan-topic", "哈哈" + i);
        }

        return "SUCCESS";
    }
}
