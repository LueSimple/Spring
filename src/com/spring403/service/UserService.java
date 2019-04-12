package com.spring403.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring403.dao.UserDao;
import com.spring403.domain.User;
@Service
public class UserService {
	@Autowired
	UserDao userDao;
       public List<User> getAll(JdbcTemplate jd){
    	   return userDao.getAll(jd);
       }
}
