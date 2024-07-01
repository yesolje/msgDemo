package com.example.demo.msg;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Profile({"tut1","hello-world"})
//@Configuration
/*@Configutation : 스프링에 이것이 자바 설정인지 알려주고 큐"hello"와 sender, receiver 를 설정해줌*/
public class Tut1Config {
	/*@Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public Consumer receiver() {
        return new Consumer();
    }

    @Profile("sender")
    @Bean
    public Producer sender() {
        return new Producer();
    }*/
}
