package anix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    //Field Injection
    @Autowired
    @Qualifier("randomFortuneService")
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


    public SwimCoach(){

    }

    @Override
    public String getDailyWorkout() {
        return "Practice Tennis workout";
    }

    @Override
    public String getDailyFortune(){
        return this.fortuneService.getDailyFortune();
    }

    //Getters
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
