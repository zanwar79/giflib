package com.sweng.giflib.config;

import org.hashids.Hashids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by ZAnwar on 1/26/2017.
 */

@Configuration
@PropertySource("app.properties")
public class AppConfig {
    @Autowired
    private Environment env;

    @Bean
    public Hashids hashids() {
        return new Hashids(env.getProperty("giflib.hash.salt"),8);
    }
}
