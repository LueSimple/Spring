package com.spring403.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring403.domain.User;
@Repository
public interface UserDao {
     List<User> getAll(JdbcTemplate jd);
}
