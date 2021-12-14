package real_spring_examples;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */

public class ShakespearQuoter implements Quoter {
    @Setter
    private List<String> quotes;

    @Value("${JAVA_HOME}") // just example
    private String javaHome;

    @Override
    public void sayQuote() {
        quotes.forEach(System.out::println);
    }
}
