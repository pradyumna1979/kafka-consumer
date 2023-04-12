package com.kafkatask.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    @KafkaListener(topics = "tweeter", groupId = "tweetr-group")
    public void consume(String quote){
    log.info("quote : {} ",quote);
    }
}
