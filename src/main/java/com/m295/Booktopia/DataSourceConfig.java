package com.m295.Booktopia;

import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfig {

    //@Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/booktopia");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("postgres");
        return dataSourceBuilder.build();
    }
}

