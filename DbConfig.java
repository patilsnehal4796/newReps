package com.cjc.common;

import java.util.Properties;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.cjc.model.Address;
import com.cjc.model.Student;


@Configuration
public class DbConfig {

	
	@Value("${db.driver}")
	private String driver;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String user;
	@Value("${db.password}")
	private String pass;
	@Value("${hibernate.dialect}")
	private String dialect;
	@Value("${hibernate.show_sql}")
	private String show_sql;
	@Value("${hibernate.hbm2ddl.auto}")
	private String hbm2ddl;
	
@Bean
public DataSource getDataSource()
{
	DriverManagerDataSource ds=new DriverManagerDataSource();
	
	ds.setDriverClassName(driver);
	ds.setUrl(url);
	ds.setUsername(user);
	ds.setPassword(pass);
	
	return ds;
	
}
	
@Bean
public LocalSessionFactoryBean getSessionFactory()
{
	
	LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
	
	sf.setDataSource(getDataSource());
	
	Properties ps=new Properties();
	
	ps.setProperty("hibernate.dialect", dialect);
	ps.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);
	ps.setProperty("hibernate.show_sql", show_sql);
	sf.setHibernateProperties(ps);
    sf.setAnnotatedClasses(Student.class,Address.class);
	
	return sf;
}
	
}