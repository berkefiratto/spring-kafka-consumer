package com.berke.kafka.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventPayload {
    private String id;
    private String type;
    private String content;
}
