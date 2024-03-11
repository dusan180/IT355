package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Oblik kvadrat() {
        return new Kvadrat(5); // Primer vrednosti stranice
    }

    @Bean
    public Oblik krug() {
        return new Krug(3); // Primer vrednosti poluprečnika
    }

    @Bean
    public Oblik jednakostranicniTrougao() {
        return new JednakostranicniTrougao(6); // Primer vrednosti stranice
    }
}
