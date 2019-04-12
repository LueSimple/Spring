package com.spring403.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring403.domain.ProductClass;
@Repository
public interface ProductClassDao {
     List<ProductClass> getAll( JdbcTemplate jd);
}
