package io.madeformaid.common.global.event.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ImageEventConsumer {

    @KafkaListener(topicPattern = "image-using", groupId = "order-consumer-group")
    public void consumeImageUsing(String message) {
        System.out.println("ImageUsingEvent received: " + message);
    }

    @KafkaListener(topicPattern = "image-unusing", groupId = "order-consumer-group")
    public void consumeImageUnusing(String message) {
        System.out.println("ImageUnusingEvent received: " + message);
    }
}
