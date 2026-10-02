package com.study.springbootstudy;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
		private final ProductRepository productRepository;
		public ProductService(ProductRepository productRepository) {
			this.productRepository = productRepository;
		}
		public List<Product> findAll(){
		return productRepository.findAll();}
}
