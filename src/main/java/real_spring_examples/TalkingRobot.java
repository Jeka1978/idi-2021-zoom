package real_spring_examples;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobot {


    @Setter
    @Autowired
    private List<Quoter> quoters;

    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }




}









