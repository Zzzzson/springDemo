package com.springapp.service;

import com.springapp.db.UserMapper;
import com.springapp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ubuntu on 3/11/14.
 */
@Service
public class UserService {
     @Autowired
     private UserMapper userMapper;

     public User getUser(String name, String password){
         return userMapper.getUser(name,password);
     }
}
