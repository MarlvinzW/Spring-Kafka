package zw.dreamhub.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zw.dreamhub.publishers.Publisher;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 20/12/2022
 */


@RestController
@RequestMapping(path = "/api/v1/")
@RequiredArgsConstructor
public class PublisherController {

    private final Publisher publisher;

    @GetMapping("publish")
    ResponseEntity<String> publish(
            @RequestParam("topicName") String topicName,
            @RequestParam("message") String message) {
        publisher.sendMessage(topicName, message);
        return ResponseEntity.ok().body("Success");
    }

}
