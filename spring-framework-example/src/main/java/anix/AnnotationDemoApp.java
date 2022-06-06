package anix;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Workout is:" + myCoach.getDailyWorkout());

        System.out.println("Fortune is:" + myCoach.getDailyFortune());

        SwimCoach mySwimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println("Swim coach email:"+mySwimCoach.getEmail());

        mySwimCoach.apiCall();

        context.close();
    }
}
