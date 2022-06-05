package anix;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "HappyFortuneService - Today is your lucky day!";
    }
}
