package real_spring_examples;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ImportResource("classpath:context.xml")
@ComponentScan
public class MainConfig {
}
