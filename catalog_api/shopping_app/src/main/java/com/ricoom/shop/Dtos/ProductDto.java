package com.ricoom.shop.Dtos;

import com.ricoom.shop.models.Category;
import com.ricoom.shop.models.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public class ProductDto {
	
	private String title;
	private String description;
	private double price;
	private double dicountPercentage;
	private int rating;
	private int stock;
	private String brand;
    private Category category;
	private String images[];
}
