package com.example.Springbootplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

//@SpringBootApplication(scanBasePackages = {"com.example.Springbootplay.model", "com.example.Springbootplay.controller"})
@SpringBootApplication
public class SpringbootplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootplayApplication.class, args);
        System.out.println("Springbootplay started");
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDatabaseFactory databaseFactory, MappingMongoConverter converter) {
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return new MongoTemplate(databaseFactory, converter);
    }

}
