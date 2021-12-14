package real_spring_examples;

import lombok.Setter;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @Setter
    private List<String> quotes;

    @Override
    public void sayQuote() {
        quotes.forEach(System.out::println);
    }
}
