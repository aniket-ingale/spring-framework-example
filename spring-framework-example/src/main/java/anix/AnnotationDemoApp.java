package anix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Workout is:" + myCoach.getDailyWorkout());

        System.out.println("Fortune is:" + myCoach.getDailyFortune());

        context.close();
    }
}
