package com.mistermorse.flawlessbeansjavaspringapi.controller;

import com.mistermorse.flawlessbeansjavaspringapi.config.MongoProperties;
import com.mistermorse.flawlessbeansjavaspringapi.domain.User;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private ApplicationContext applicationContext;
    private MongoProperties mongoProperties;

    @Autowired
    public UserController(MongoProperties mongoProperties) {
        this.applicationContext = new AnnotationConfigApplicationContext();
        this.mongoProperties = mongoProperties;
    }

    @GetMapping("/mongo-properties")
    public String getMongoProperties() {
//        return this.mongoProperties;
//        ApplicationContext applicationContext =
        SimpleMongoClientDatabaseFactory simpleMongoClientDatabaseFactory = new SimpleMongoClientDatabaseFactory(MongoClients.create(),"abc");
        return simpleMongoClientDatabaseFactory.getMongoDatabase().getName();
    }

    @PostMapping("/login")
    public String login(@RequestBody User object) {
//        System.out.println(object.getPassword());
        return object.lastName;
    }

}
