package com.idi.idi2021zoom;

import com.idi.idi2021zoom.super_watch.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Idi2021ZoomApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Idi2021ZoomApplication.class, args);
        Human human = context.getBean(Human.class);
        human.checkWatch();
    }

}
