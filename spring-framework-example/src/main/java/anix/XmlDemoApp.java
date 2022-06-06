package anix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Workout is:" + myCoach.getDailyWorkout());

        System.out.println("Fortune is:" + myCoach.getDailyFortune());

        SwimCoach mySwimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println("Swim coach email:"+mySwimCoach.getEmail());

        context.close();
    }
}
