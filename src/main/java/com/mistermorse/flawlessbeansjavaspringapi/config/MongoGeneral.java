package com.mistermorse.flawlessbeansjavaspringapi.config;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import static java.util.Collections.singletonList;

@Configuration
public class MongoGeneral extends AbstractMongoClientConfiguration {

    private ApplicationContext applicationContext;
    private MongoProperties mongoProperties;

    @Autowired
    public MongoGeneral(MongoProperties mongoProperties) {
        this.applicationContext = new AnnotationConfigApplicationContext();
        this.mongoProperties = mongoProperties;
    }

//    @NonNull
    protected String getDatabaseName() {
        System.out.println(getDatabaseName());
        return mongoProperties.getDatabase();
    }

//    protected MongoClient cre

//    protected void configureClientSettings(MongoClientSettings.Builder builder) {
//        builder
//                .credential(MongoCredential.createCredential(mongoProperties.getUsername(), getDatabaseName(), mongoProperties.getPassword().toCharArray()))
//                .applyToClusterSettings(settings -> {
//                    settings.hosts(singletonList(new ServerAddress("mongodb+srv://matthewharp:8yrHYLCGoLdLtuIq@cluster0.2ahn6zq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")));
//                });
//    }

}
