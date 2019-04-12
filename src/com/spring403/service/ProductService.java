package com.spring403.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring403.dao.ProductDao;
import com.spring403.domain.Product;
import com.spring403.domain.ProductClass;
@Service
public class ProductService {
	@Autowired
	private ProductDao pDao ;
	/*
	 * 查询所有商品
	 * */
    public List<Product> getALL( JdbcTemplate jd){
    	return pDao.getAll(jd); 
    }
    /*
	 * 添加商品
	 * */
    public int addProduct(Product pro,JdbcTemplate jt) {
    	
    	return pDao.addProduct(pro,jt);
    	
    }
    
    /*
	 * 删除商品
	 * */
    public int deleteProduct(int proID,JdbcTemplate jt) {
    	
    	return pDao.deleteProduct(proID,jt);
    }
    
    /*
   	 * 修改商品
   	 * */
    public int updateProduct(Product pro1,JdbcTemplate jt) {
    	
    	return pDao.updateProduct(pro1,jt);
    }
    
    
}
