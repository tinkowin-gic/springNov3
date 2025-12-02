package com.my.test.No4.services;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DataBaseTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String test() {
        Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        String str = "DataSource class: " + dataSource.getClass() 
                    + " , Database connection test result: " + result;
        return str;
    }
}
