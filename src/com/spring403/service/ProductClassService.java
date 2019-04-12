package com.spring403.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring403.dao.ProductClassDao;
import com.spring403.domain.Product;
import com.spring403.domain.ProductClass;
@Service
public class ProductClassService {
		@Autowired
	   ProductClassDao pcDao;
		 public List<ProductClass> getALL( JdbcTemplate jd){
		    	return pcDao.getAll(jd); 
		    }
}
