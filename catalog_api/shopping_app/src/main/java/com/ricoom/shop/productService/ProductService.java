package com.ricoom.shop.productService;

import java.util.List;

import com.ricoom.shop.Dtos.ProductDto;
import com.ricoom.shop.models.Category;
import com.ricoom.shop.models.Product;

public interface ProductService {
public ProductDto addProduct(ProductDto product);
public List<Product> findBycategoty(Category category);
public List<Product> getProducts();
public void deleteProduct(Product product);
public Category createCategory(String categoryname);
}
