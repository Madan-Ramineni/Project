package com.sample.SampleProject.controller;

import com.sample.SampleProject.service.RetrieveUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sample.SampleProject.service", "com.sample.SampleProject.controller"})
@EntityScan("com.sample.SampleProject.model")
@EnableJpaRepositories("com.sample.SampleProject.dao")
public class SampleProjectApplication extends SpringBootServletInitializer {

    @Autowired
    RetrieveUserServiceImpl retrieveUserService;

    public static void main(String[] args) {
        SpringApplication.run(SampleProjectApplication.class, args);
        System.out.println("here");
        //new SampleProjectApplication().retrieveUsers();
    }

//    public void retrieveUsers() {
//        List<User> users = retrieveUserService.findAll();
//        users.stream().forEach(user -> {
//            System.out.println(user.toString());
//        });
//    }
}
