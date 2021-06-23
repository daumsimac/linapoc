package com.lina.controller.dao.impl;

import javax.annotation.*;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport; 


public class BaseDaoBean  extends SqlSessionDaoSupport {
	
	@Resource(name = "sqlSessionFactory")
	public void setSuperSqlSessionFactory(SqlSessionFactory sqlSessionFactoryForACARS) {
	        super.setSqlSessionFactory(sqlSessionFactoryForACARS);
	}

}
