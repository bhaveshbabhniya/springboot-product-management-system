package com.springboot.product_management_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

	private Long id;
	
	@NotBlank(message = "Name is required!")
	private String name;
	
	private String Description;
	
	@Min(value = 0, message = "price must be positive!")
	private double price;
	
}