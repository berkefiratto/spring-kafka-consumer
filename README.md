# Spring Kafka Consumer

A lightweight and clean example of a Kafka consumer built with Spring Boot, designed to listen to real-time JSON messages and process them.

## 🔧 Features
- 📡 Kafka topic subscription using @KafkaListener
- 🧩 JSON payload parsing
- 🛠️ Logging and custom processing logic
- 🧼 Graceful error handling

## 🛠️ Tech Stack
- Java 17+
- Spring Boot
- Spring Kafka
- Apache Kafka
- Maven
- Lombok (optional)

## 📂 Project Structure
com.berke.kafka
├─ consumer/
│    └─ MessageListener.java
├─ config/
│    └─ KafkaConsumerConfig.java
├─ model/
│    └─ EventPayload.java
└─ service/
     └─ MessageProcessor.java
