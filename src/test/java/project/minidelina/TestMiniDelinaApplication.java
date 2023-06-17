package project.minidelina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMiniDelinaApplication {


    public static void main(String[] args) {
        SpringApplication.from(MiniDelinaApplication::main).with(TestMiniDelinaApplication.class).run(args);
    }

}
