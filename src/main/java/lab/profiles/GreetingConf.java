package lab.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class GreetingConf {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(GreetingConf.class);
    }
}
