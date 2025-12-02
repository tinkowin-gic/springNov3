package com.my.test.No4.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("no4Config")
public class AppConfig {

    @Bean("no4DB")
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost/mydb")
                .username("user")
                .password("pass")
                .build();
    }
}
