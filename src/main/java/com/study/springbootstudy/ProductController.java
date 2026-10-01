package com.study.springbootstudy;

import org.springframework.web.bind.annotation.DeleteMapping;
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
		@PutMapping
		public Product updateProduct(@PathVariable int id,
									@RequestBody Product product) {
			return product;
		}
		@DeleteMapping
		public String delteProduct(@PathVariable int id) {
			return "Delete product id = "+id;
		}
}
