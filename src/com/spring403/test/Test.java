package com.spring403.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring403.domain.Product;
import com.spring403.domain.ProductClass;
import com.spring403.domain.User;
import com.spring403.service.ProductClassService;
import com.spring403.service.ProductService;
import com.spring403.service.UserService;
@Component
public class Test {
	@Autowired
	private ProductService ps; 
	@Autowired
	private UserService us;
	@Autowired
	private ProductClassService pcs;
    public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jd = (JdbcTemplate) ac.getBean("jdbcTemplate");
		Test test = (Test) ac.getBean("test");
		//Test test = new Test();
		
		/*List<User> all = test.us.getAll(jd);
			for (User p : all) {
			System.out.println(p);
		}
	     List<Product> all1=test.ps.getALL(jd);
	       	for(Product ab: all1) {
	    	 System.out.println(ab);
	       }
		 List<ProductClass> all2=test.pcs.getALL(jd);
		   	for(ProductClass ab: all2) {
		   	System.out.println(ab);
		       }*/
		
//		   	测试添加商品
		   	Product pro=new Product();
		   	
		   /*	pro.setProID(21);
		   	pro.setProName("小米5");
		   	pro.setProDetail("超长待机");
		   	test.ps.addProduct(pro, jd);*/
		   	
//		   	测试删除商品
		   	/*test.ps.deleteProduct(21, jd);*/
		   	
//		   	测试修改商品
		  	pro.setProID(20);
		   	pro.setProDetail("无线充电");
		   	pro.setProName("小米6");
			test.ps.updateProduct(pro, jd);
		   	
	}

}
