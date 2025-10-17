package com.example.emailsendproducer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public EmailService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEmail(SendEmailRequestDto request) {
        EmailsendMessage emailsendMessage = new EmailsendMessage(request.getFrom(), request.getTo(), request.getSubject(), request.getBody());
        this.kafkaTemplate.send("email.send", toJsonString(emailsendMessage));
    }

    private String toJsonString(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String message = objectMapper.writeValueAsString(object);
            return message;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON 직렬화 실패");
        }
    }
}
