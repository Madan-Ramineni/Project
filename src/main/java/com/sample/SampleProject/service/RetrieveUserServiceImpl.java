package com.sample.SampleProject.service;


import com.sample.SampleProject.dao.RetrieveUserRep;
import com.sample.SampleProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrieveUserServiceImpl implements RetrieveUserService {

    @Autowired
    RetrieveUserRep retrieveUserRep;

    public List<User> findAll() {
        return retrieveUserRep.findAll();
    }
}
