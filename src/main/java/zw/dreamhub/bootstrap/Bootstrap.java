package zw.dreamhub.bootstrap;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 10/1/2023
 */

@Component
@Slf4j
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private final Environment env;

    @Override
    public void run(String... args) {

        log.info("--- Getting Application Env -----");
        log.info("Group ID : {}", env.getProperty("spring.kafka.consumer.group-id"));
        log.info("Bootstrap Servers : {}", env.getProperty("spring.kafka.consumer.bootstrap-servers"));
        log.info("--- Application Started -----");

    }
}
