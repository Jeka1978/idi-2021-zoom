package real_spring_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


       /* ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);


        System.out.println();

    }
}
