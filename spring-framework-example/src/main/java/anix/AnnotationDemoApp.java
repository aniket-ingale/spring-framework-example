package anix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("thatTennisCoach", Coach.class);

        System.out.println("Workout is:" + myCoach.getDailyWorkout());

        context.close();
    }
}