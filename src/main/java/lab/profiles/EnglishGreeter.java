package lab.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static lab.profiles.Languages.ENG;
import static lab.profiles.Languages.SPANISH;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile(ENG)
public class EnglishGreeter implements GreetingService {
    @Override
    public String greet() {
        return "Hello";
    }
}
