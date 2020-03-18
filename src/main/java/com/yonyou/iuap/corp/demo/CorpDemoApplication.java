package com.yonyou.iuap.corp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value= {"classpath:apiuri.properties","classpath:productApiuri.properties"})
public class CorpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorpDemoApplication.class, args);
    }

}

