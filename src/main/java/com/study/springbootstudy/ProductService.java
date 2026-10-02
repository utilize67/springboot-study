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
		public Product getById(int id) {
			return productRepository.findById(id);
		}
		public int createProduct(Product product) {
			return productRepository.save(product);
		}
		public int updateProduct(int id,Product product) {
			return productRepository.update(id, product);
		}
		public int deleteById(int id) {
			return productRepository.deleteById(id);
		}
		
}
