package com.study.springbootstudy;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
		private final ProductRepository productRepository;
		public ProductService(ProductRepository productRepository) {
			this.productRepository = productRepository;
		}
		public String testConnection() {
		    return productRepository.testConnection();
		}
}
