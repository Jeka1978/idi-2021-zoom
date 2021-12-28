package real_spring_examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TrumpeldorQuoter implements Quoter {

    @Value("${trumpeldor}")
    private String message;

    @InjectRandom(min = 3, max = 7)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
