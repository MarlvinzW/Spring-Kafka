package zw.dreamhub.publishers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 20/12/2022
 */


@Service
@RequiredArgsConstructor
public class Publisher {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String topicName, String msg) {
        kafkaTemplate.send(topicName, msg);
    }

}
