package com.ricoom.shop.productService;

import java.util.List;

import org.hibernate.query.Page;

import com.ricoom.shop.Dtos.ProductDto;
import com.ricoom.shop.Dtos.ProductsPage;
import com.ricoom.shop.models.Category;
import com.ricoom.shop.models.Product;

public interface ProductService {
public ProductDto addProduct(ProductDto product);
public List<Product> findBycategoty(String category);
public List<Product> getProducts();
public void deleteProduct(Product product);
public Category createCategory(String categoryname);
public ProductsPage getpageProducts(int pageNumber, int pageSize);

}
