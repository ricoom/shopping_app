package com.ricoom.shop.Dtos;

import java.util.List;

import com.ricoom.shop.models.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductsPage {
	private List<Product> allProducts;
	private int pageNumber;
	private int pageSize;
	private long TotalProducts;
	

}
