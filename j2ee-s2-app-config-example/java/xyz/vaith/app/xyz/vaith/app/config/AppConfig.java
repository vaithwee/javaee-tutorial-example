package xyz.vaith.app.xyz.vaith.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.vaith.app.domain.*;

@Configuration
public class AppConfig {
    @Value("孙悟空") String personName;
    @Bean(name = "chinese")
    public Person person() {
        Chinese p = new Chinese();
        p.setAxe(stoneAxe());
        p.setName(personName);
        return p;
    }

    @Bean(name = "stoneAxe")
    public Axe stoneAxe() {
        return new StoneAxe();
    }
    @Bean(name = "steelAxe")
    public Axe steelAxe() {
        return new SteelAxe();
    }
}
