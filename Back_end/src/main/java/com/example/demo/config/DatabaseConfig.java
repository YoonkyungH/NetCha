package com.example.demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.username("test_user");
        dataSourceBuilder.password("1234");

        dataSourceBuilder.url("jdbc:mysql://localhost:3306/STUDY_DB?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul");

        return dataSourceBuilder.build();
    }
}
