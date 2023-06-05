package contact;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ContactConfiguration.class);
        var sessionFactory = context.getBean(SessionFactory.class);


    }
}
