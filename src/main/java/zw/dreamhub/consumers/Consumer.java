package zw.dreamhub.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 20/12/2022
 */


@Service
@Slf4j
public class Consumer {

    @Value("${listeners.topic1}")
    private String topic1;

    @KafkaListener(topics = "${listeners.topic1}")
    public void listenForTopic1(String message) {
        log.info("Topic : {} \n New message : {} ", topic1, message);
    }

}
