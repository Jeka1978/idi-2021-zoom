package real_spring_examples;

import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */


@BookComponent
public class ShakespearQuoter implements Quoter {

    private List<String> quotes;

    @Value("${shake}")
    public void setQuotes(String[] quotes) {
        this.quotes = Arrays.asList(quotes);
    }

    @Value("${JAVA_HOME}") // just example
    private String javaHome;

    @Override
    public void sayQuote() {
        quotes.forEach(System.out::println);
    }
}
