package com.yifan.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaConfig {

//    private final KafkaProperties properties;
//
//    public KafkaConfig(KafkaProperties properties) {
//        this.properties = properties;
//    }
//
//    @Bean
//    public KafkaAdmin admin(){
//        KafkaAdmin admin = new KafkaAdmin(properties.buildAdminProperties());
//        admin.setFatalIfBrokerNotAvailable(true);
//        return admin;
//    }
    @Bean
    public NewTopic topic2() {
        return new NewTopic("wuyifan-topic-9", 2, (short) 1);
    }
}
