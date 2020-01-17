package com.yifan.runner;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

//@Component
public class KafkaSender implements CommandLineRunner {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void run(String... args) {
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send("topic1", 2, "test","哈哈" + i);
        }
    }
}
