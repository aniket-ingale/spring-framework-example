package anix;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "RandomFortuneService - Today is your lucky day!";
    }
}
