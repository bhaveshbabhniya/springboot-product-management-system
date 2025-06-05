package com.springboot.product_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product_management_system.dto.ProductDTO;
import com.springboot.product_management_system.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired ProductService service;
	
	@PostMapping
	public ProductDTO create(@RequestBody @Valid ProductDTO dto) {
		return service.createProduct(dto);
	}
	
	@GetMapping("/{id}")
	public ProductDTO getById(@PathVariable Long id) {
		return service.getProductById(id);
	}
	
	@GetMapping
	public List<ProductDTO> getALl() {
		return service.getAllProducts();
	}
	
	@PutMapping("/{id}")
	public ProductDTO update(@PathVariable Long id, @RequestBody @Valid ProductDTO dto) {
		return service.updateProduct(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteProduct(id);
	}
}