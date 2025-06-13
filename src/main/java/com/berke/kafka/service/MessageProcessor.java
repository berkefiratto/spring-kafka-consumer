package com.berke.kafka.service;

import com.berke.kafka.model.EventPayload;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessor {

    public void process(EventPayload payload) {
        System.out.println("Processing payload: " + payload);
        // Business logic 
    }
}
