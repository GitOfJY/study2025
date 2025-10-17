package com.example.emailservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserSignedUpEventDltConsumer {
    @KafkaListener(
            topics = "user.signed-up.dlt",
            groupId = "email-service"
    )
    public void consume(String message) {
        // 실제 로직 생략
        System.out.println("로그 시스템에 전송 : " + message);
        System.out.println("SLack 알림 발송");
    }
}
