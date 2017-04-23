package com.sweng.giflib.dao;

import com.sweng.giflib.model.User;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;


public interface UserDao {
    User findByUsername(String username);
}
