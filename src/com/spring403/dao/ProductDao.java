package com.spring403.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring403.domain.Product;
import com.spring403.domain.ProductClass;
@Repository
public interface ProductDao {
	
	List<Product> getAll (JdbcTemplate jt);

	Product mapRow(ResultSet rs, int rownum) throws SQLException;

	int addProduct(Product pro, JdbcTemplate jt);

	int updateProduct(Product pro1, JdbcTemplate jt);

	int deleteProduct(int proID, JdbcTemplate jt);

	


}
