package com.kanject.myshiro2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.kanject.myshiro2.mapper")
public class Myshiro2Application {

	public static void main(String[] args) {
		SpringApplication.run(Myshiro2Application.class, args);
	}
}
