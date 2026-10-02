package com.study.springbootstudy;

import java.util.List;

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
	private final ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	@GetMapping
	public List<Product> getAllProduct() {
	    return productService.findAll();
	}
	@GetMapping("/{id}")
	public Product getById(@PathVariable int id) {
		return productService.getById(id);
	}
	@PostMapping
	public int createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
    @PutMapping("/{id}")
    public int updateProduct(@PathVariable int id,@RequestBody Product product) {
    	return productService.updateProduct(id, product);
    }
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable int id) {
    	return productService.deleteById(id);
    }
}