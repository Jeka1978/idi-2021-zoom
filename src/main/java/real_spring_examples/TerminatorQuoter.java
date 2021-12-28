package real_spring_examples;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@BookComponent
@Film
//@Order(1)
public class TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("AStalavista baby");
    }
}
