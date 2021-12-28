package lab.profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = GreetingConf.class)
@ActiveProfiles(Languages.SPANISH)
public class SmartRobotTest {

    @Autowired
    private GreetingService greetingService;


    @Test
    public void testSpanish() {
        String greet = greetingService.greet();
        Assert.assertEquals("Hola",greet);
    }
}