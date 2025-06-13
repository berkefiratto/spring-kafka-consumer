package com.berke.kafka.consumer;

import com.berke.kafka.model.EventPayload;
import com.berke.kafka.service.MessageProcessor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private final MessageProcessor processor;

    public MessageListener(MessageProcessor processor) {
        this.processor = processor;
    }

    @KafkaListener(topics = "event-topic", groupId = "berke-group")
    public void consume(EventPayload payload) {
        System.out.println("Received message: " + payload);
        processor.process(payload);
    }
}
