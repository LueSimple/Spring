package com.spring403.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.spring403.dao.ProductClassDao;
import com.spring403.domain.ProductClass;
@Repository
public class ProductClassImpl implements ProductClassDao {

	@Override
	public List<ProductClass> getAll( JdbcTemplate jd) {
		// TODO Auto-generated method stub
	 	String sql="select * from proclass";
	 	List<ProductClass> pcs = new ArrayList<ProductClass>();
		jd.query(sql,  new RowCallbackHandler() {

			@Override
	    public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				ProductClass procl=new ProductClass();
				procl.setProCID(rs.getInt("proCID"));
				procl.setProCName(rs.getString("proCName"));
				pcs.add(procl);
				
			}});
		if(pcs!=null && pcs.size()>0) {
			for(int i=0;i<pcs.size();i++) {
			System.out.println(pcs.get(i));
			}
		}
		return pcs; 
	}

}
