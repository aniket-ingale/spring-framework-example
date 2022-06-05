package anix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
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
