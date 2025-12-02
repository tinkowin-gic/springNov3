package com.my.test.No14.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration("no14Config")
public class AppConfig {

    @Bean(name = "db1")
    @ConfigurationProperties("spring.datasource.db1")
    @Primary
    public HikariDataSource dataSource1() {
        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "db2")
    @ConfigurationProperties("spring.datasource.db2")
    public HikariDataSource dataSource2() {
        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }

}
