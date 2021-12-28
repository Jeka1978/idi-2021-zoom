package lab.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class SmartRobot {
    @Autowired
    private GreetingService greetingService;

    @PostConstruct
    public void init(){
        System.out.println(greetingService.greet());
    }

}
