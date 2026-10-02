package com.study.springbootstudy;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final DataSource dataSource;

    public ProductRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String testConnection() {
        try (Connection connection = dataSource.getConnection()) {
            return "Database connected";
        } catch (SQLException e) {
            return "Database connection failed";
        }
    }
}