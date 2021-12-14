package real_spring_examples;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class TrumpeldorQuoter implements Quoter {

    @Setter
    private String message;

    @InjectRandom(min = 3,max = 7)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
