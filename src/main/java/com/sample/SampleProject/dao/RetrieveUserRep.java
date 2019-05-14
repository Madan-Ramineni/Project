package com.sample.SampleProject.dao;

import com.sample.SampleProject.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RetrieveUserRep extends CrudRepository<User, String> {

    @Override
    List<User> findAll();
}
