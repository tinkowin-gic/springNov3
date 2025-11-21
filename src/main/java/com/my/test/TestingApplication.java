package com.my.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
//@EnableScheduling 
public class TestingApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource; 

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource class: " + dataSource.getClass());
		Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
		System.out.println("Database connection test result: " + result);
	}

}
