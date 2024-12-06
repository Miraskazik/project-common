package cz.rb.projectcommon.config;


import cz.rb.projectcommon.service.MessagingFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@ComponentScan("cz.rb.projectcommon")
@Configuration
public class CommonConfig {

    @Bean
    public MessagingFactory messagingFactory() {
        return new MessagingFactory();
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplateBuilder.defaultHeader("Content-Type", "application/json");
        return restTemplateBuilder.build();
//        return new RestTemplate();
    }


}