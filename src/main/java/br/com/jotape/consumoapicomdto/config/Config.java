package br.com.jotape.consumoapicomdto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    /*
        @Bean
        Sempre que injetar um RestTemplate em outras partes da aplicação,
        o Spring usará este método para criar a instância.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
