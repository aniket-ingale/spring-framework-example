package anix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("anix")
@PropertySource(value = { "classpath:application.properties" })
public class SportConfig {

    @Bean
    public ThirdPartyInterface remoteClient(){
        ThirdPartyInterface thirdParty = new ThirdPartyImpl();
        return thirdParty;
    }

}
