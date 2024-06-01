package com.mistermorse.flawlessbeansjavaspringapi;

import com.mistermorse.flawlessbeansjavaspringapi.config.MongoGeneral;
import com.mistermorse.flawlessbeansjavaspringapi.domain.User;
import com.mongodb.client.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class FlawlessBeansJavaSpringApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MongoGeneral.class);
		MongoClient mongoClient = context.getBean("getSimpleMongoClient", MongoClient.class);
		System.out.println(mongoClient.listDatabaseNames().first());
//		SpringApplication.run(FlawlessBeansJavaSpringApiApplication.class, args);
	}

}
