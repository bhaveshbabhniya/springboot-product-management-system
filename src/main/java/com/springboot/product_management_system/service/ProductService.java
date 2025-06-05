package com.springboot.product_management_system.service;

import java.util.List;

import com.springboot.product_management_system.dto.ProductDTO;

public interface ProductService {
	
	ProductDTO createProduct(ProductDTO productDTO);
	ProductDTO getProductById(Long id);
	List<ProductDTO> getAllProducts();
	ProductDTO updateProduct(Long id, ProductDTO productDTO);
	void deleteProduct(Long id);
}
