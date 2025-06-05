package com.springboot.product_management_system.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.product_management_system.dto.ProductDTO;
import com.springboot.product_management_system.entity.Product;
import com.springboot.product_management_system.exception.ResourceNotFoundException;
import com.springboot.product_management_system.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired private ProductRepository productRepository;
	@Autowired private ModelMapper modelMapper;
	
	@Override
	public ProductDTO createProduct(ProductDTO dto) {
		Product product = modelMapper.map(dto, Product.class);
		return modelMapper.map(productRepository.save(product), ProductDTO.class);
	}
	
	@Override
	public ProductDTO getProductById(Long id) {
		Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("product not found"));
		return modelMapper.map(product, ProductDTO.class);
	}
	
	@Override
	public List<ProductDTO> getAllProducts() {
		return productRepository.findAll().stream().map(product -> modelMapper.map(product, ProductDTO.class)).collect(Collectors.toList());
	}
	
	@Override
	public ProductDTO updateProduct(Long id, ProductDTO dto) {
		Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("product not found"));
		product.setName(dto.getName());
		product.setDescription(dto.getDescription());
		product.setPrice(dto.getPrice());
		return modelMapper.map(productRepository.save(product), ProductDTO.class);
	}
	
	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
