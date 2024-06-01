package com.mistermorse.flawlessbeansjavaspringapi.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.lang.NonNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;


@Configuration
public class MongoGeneral extends AbstractMongoClientConfiguration {

//    @Value("${spring.data.mongodb.username}")
//    private String username;
//
//    @Value("${spring.data.mongodb.password}")
//    private String password;
//
//    @Value("${spring.data.mongodb.database}")
//    private String database;

//    "mongodb+srv://matthewharp:JuUdw6ONZeExgB98@cluster0.2ahn6zq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"

    @NonNull
    @Override
    protected String getDatabaseName() {
        return "flawless-beans";
    }

    @Bean(name = "getSimpleMongoClient")
    MongoClient getSimpleMongoClient() {
        return MongoClients.create("mongodb+srv://matthewharp:JuUdw6ONZeExgB98@cluster0.2ahn6zq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
    }

}
