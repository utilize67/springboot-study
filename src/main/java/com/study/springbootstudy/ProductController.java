package com.study.springbootstudy;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return product;
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable int id,
            @RequestBody Product product) {
        return product;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return "Delete product id = " + id;
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        Product product = new Product();
        product.setName("Java Book");
        product.setPrice(59.9);
        product.setStock(20);

        return product;
    }
}