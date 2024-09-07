package com.example.demo.config;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.DB;
import com.example.demo.devDB;
import com.example.demo.prodDB;

@Configuration
public class appconfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDb(){
        return new devDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDb(){
        return new prodDB();
    }
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
