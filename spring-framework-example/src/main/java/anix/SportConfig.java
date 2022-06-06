package anix;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("anix")
@PropertySource(value = { "classpath:sport.properties" })
public class SportConfig {

}
