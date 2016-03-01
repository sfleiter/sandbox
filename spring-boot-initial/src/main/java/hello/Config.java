package hello;

import hello.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public MyService myService() {
        return new MyService("bar");
    }
}
