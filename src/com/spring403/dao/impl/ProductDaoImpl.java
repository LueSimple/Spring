package com.spring403.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring403.dao.ProductDao;
import com.spring403.domain.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	
		/*
		 * 添加商品
		 * */
		@Override
		public int addProduct(Product pro,JdbcTemplate jt) {
			
		String sql="INSERT INTO product(proName,proPrice,proDetail)VALUES(?,?,?)";
		
		int n=jt.update(sql,pro.getProName(),pro.getProPrice(),pro.getProDetail());
		
		return n;
		
		}
		
		
		
		/*
		 * 删除商品
		 * */
		@Override
		public int deleteProduct(int proID,JdbcTemplate jt) {
			
		String sql="DELETE FROM product WHERE proID=?";
		
		int n=jt.update(sql,proID);
		
		return n;
		
		}
		
		
		/*
		 * 修改商品
		  */
		@Override
		public int updateProduct(Product pro,JdbcTemplate jt) {
			
		String sql="UPDATE product SET proName=?,proDetail=? WHERE product.proID=?";
		
		int n=jt.update(sql, pro.getProName(),pro.getProDetail(),pro.getProID());

		
		return n;
		
		}
		
		/*
		 * 查询商品
		 * */
		@Override
		public List<Product> getAll(JdbcTemplate jt) {
			
		String sql = "select  *  from product";
		
//		执行SQL语句JdbcTemplate对象，query()
//		RowMapper行映射，表示product表中的每一行，每一行代表一个product商品
//		Rowmapper属于接口类型，不可直接new RowMapper()，可以使用匿名内部类new RowMapper<product>()
		List<Product> pros = jt.query(sql, new RowMapper<Product>() {
			
			@Override
//			rownum:行索引，从1开始
			public Product mapRow(ResultSet rs, int rownum) throws SQLException {
				
				Product pro = new Product();
				
//				列索引，从1开始
				int pid = rs.getInt(1);
				
//				字段名称
				String proname = rs.getString("proName");
				
				pro.setProID(pid);
				
				pro.setProName(proname);
				
				return pro;
			}
		});
		
		return pros;
		
	}

	@Override
	public Product mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO Auto-generated method stub
		
		return null;
	}

	

}
