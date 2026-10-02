package com.study.springbootstudy;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    public Product findById(int id) {
    	String sql ="select name,price,stock from product where id=?";
    	return jdbcTemplate.queryForObject(sql, (rs,rowNum)->{
    		Product p = new Product();
    		p.setName(rs.getString("name"));
    		p.setPrice(rs.getDouble("price"));
    		p.setStock(rs.getInt("stock"));
    		return p;
    	},id);
    	
    }
    public int save(Product product) {
    	String sql = "insert into product(name,price,stock) values(?,?,?)";
    	return jdbcTemplate.update(sql,
    			product.getName(),
    			product.getPrice(),
    			product.getStock());
    }
    public int update(int id,Product product) {
    	String sql = "update product set name=?,price=?,stock=? where id =?";
    	return jdbcTemplate.update(sql,
    			product.getName(),
    			product.getPrice(),
    			product.getStock(),
    			id
    			);
    }
    public int deleteById(int id) {
    	String sql = "delete from product where id=?";
    	return jdbcTemplate.update(sql,id);
    }
}