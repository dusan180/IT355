package com.metropolitan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Kvadrat kvadrat() {
        return new Kvadrat((-5)); // Primer: stranica kvadrata je 5
    }

    @Bean
    public Krug krug() {
        return new Krug(3); // Primer: poluprečnik kruga je 3
    }

    @Bean
    public JednakostranicniTrougao trougao() {
        return new JednakostranicniTrougao(6); // Primer: stranica trougla je 6
    }
}

