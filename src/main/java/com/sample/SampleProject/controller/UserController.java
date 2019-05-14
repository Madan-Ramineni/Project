package com.sample.SampleProject.controller;

import com.sample.SampleProject.model.User;
import com.sample.SampleProject.service.RetrieveUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    RetrieveUserServiceImpl retrieveUserRep;

    @RequestMapping("/findall")
    @ResponseBody
    public List<User> findall() {
        return retrieveUserRep.findAll();
    }


}