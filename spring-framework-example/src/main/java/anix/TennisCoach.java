package anix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    //Field Injection
    @Autowired
    public FortuneService fortuneService;

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
