/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 *
 * @author jesfrin
 */
@Configuration
@ComponentScan("com.comunidad.service")
@EnableJpaRepositories("com.comunidad.repository")
public class AppConfig {

    //Propiedades de la base de datos
    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "userComunidad";
    private static final String PASSWORD = "Password#3";
    private static final String URL = "jdbc:mysql://localhost:3306/comunidad?useSSL=false";

     //Informacion de la base de datos
    @Bean
    public DataSource dataSource() {
        //return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DRIVER_CLASS_NAME);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        dataSource.setUrl(URL);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setDatabase(Database.MYSQL);
        bean.setGenerateDdl(true);
        bean.setShowSql(true);
        return bean;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory( DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        bean.setJpaVendorAdapter(jpaVendorAdapter);
        bean.setPackagesToScan("com.comunidad.bean");
        return bean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
    
}

/**
 *
 * MySQL properties
 * 
 * CREATE SCHEMA comunidad
 * CREATE USER 'userComunidad'@'localhost' IDENTIFIED BY 'Password#3'; 
 * GRANT ALL PRIVILEGES ON comunidad.* TO 'userComunidad'@'localhost'; 
 * FLUSH PRIVILEGES;
 *
 *
 */
