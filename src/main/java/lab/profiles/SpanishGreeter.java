package lab.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static lab.profiles.Languages.SPANISH;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile(SPANISH)
//spring.profiles.active=spanish
public class SpanishGreeter implements GreetingService {
    @Override
    public String greet() {
        return "Hola";
    }
}
