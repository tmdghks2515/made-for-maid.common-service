package io.madeformaid.common.global.event.consumer;

import com.google.protobuf.InvalidProtocolBufferException;
import event.ImageEvent.ImageUnusingEvent;
import event.ImageEvent.ImageUsingEvent;
import io.madeformaid.common.domain.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ImageEventConsumer {
    private final ImageService imageService;

    @KafkaListener(topicPattern = "image-using", groupId = "image-using-consumer")
    public void consumeImageUsing(byte[] messageBytes) {
        try {
            ImageUsingEvent event = ImageUsingEvent.parseFrom(messageBytes);
            imageService.using(event);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }

    @KafkaListener(topicPattern = "image-unusing", groupId = "image-unusing-consumer")
    public void consumeImageUnusing(byte[] messageBytes) {
        try {
            ImageUnusingEvent event = ImageUnusingEvent.parseFrom(messageBytes);
            imageService.unusing(event);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
