package com.study.springbootstudy;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
    	String sql = "select name,price,stock from product";
    	return jdbcTemplate.query(sql, (rs,rowNum)->{
    		Product p = new Product();
    		p.setName(rs.getString("name"));
    		p.setPrice(rs.getDouble("price"));
    		p.setStock(rs.getInt("stock"));
			return p;
    	});
    }
}