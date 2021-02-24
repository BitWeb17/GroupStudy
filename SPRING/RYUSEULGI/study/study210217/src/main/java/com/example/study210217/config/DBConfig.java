package com.example.study210217.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// 1개 이상 Bean(java 객체)을 등록하고 있음을 알려주는 어노테이션
@Configuration
public class DBConfig {

    // Configuration이 선언된 클래스 안에 Bean 사용
    // 제어할 수 없는 외부 라이브러리 또는 설정을 위한 클래스
    @Bean
    // yaml에 작성된 내용과 동일하게 작성
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/foodtruck");
        dataSource.setUsername("seulgi");
        dataSource.setPassword("dkdlxl123");

        return dataSource;
    }
}
