package com.spring403.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.spring403.dao.UserDao;
import com.spring403.domain.Product;
import com.spring403.domain.User;
@Repository
public class UserImpl implements UserDao {

	@Override
	public List<User> getAll(JdbcTemplate jd) {
		// TODO Auto-generated method stub
		  String sql="select * from users";
		  List<User> users=	jd.query(sql, new ResultSetExtractor<List<User>>() {
			@Override
			public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				 List<User> list=new ArrayList<User>();
				while(rs.next()) {
					User us=new User();
					us.setUserID(rs.getInt(1));
					us.setUserName(rs.getString(2));
				list.add(us);	
				}
				return list;
			}});
		return users;
	}

}
