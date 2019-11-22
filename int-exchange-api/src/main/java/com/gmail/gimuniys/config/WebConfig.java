package com.gmail.gimuniys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
      
    	// 모든 uri에 대해 http://localhost 도메인은 접근을 허용한다.
        registry.addMapping("/**")
                .allowedOrigins("http://localhost");

    }
}
