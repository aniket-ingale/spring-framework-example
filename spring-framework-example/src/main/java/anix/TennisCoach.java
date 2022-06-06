package anix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    //Field Injection
    @Autowired
    @Qualifier("randomFortuneService")
    public FortuneService fortuneService;


    @PostConstruct
    public void init(){
        System.out.println("in init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("in destroy");
    }
    // Constructor Injection
//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }


    // Setter Injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }


    public TennisCoach(){

    }

    @Override
    public String getDailyWorkout() {
        return "Practice Tennis workout";
    }

    @Override
    public String getDailyFortune(){
        return this.fortuneService.getDailyFortune();
    }




}
