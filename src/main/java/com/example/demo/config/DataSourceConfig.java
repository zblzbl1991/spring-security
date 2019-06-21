package com.example.demo.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhaobaolong
 * @Title: DataSourceConfig
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/218:24
 */
@Configuration
public class DataSourceConfig {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDataSource(){
		return DataSourceBuilder.create().build();
	}
}
