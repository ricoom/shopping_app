package com.ricoom.shop.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ricoom.shop.Dtos.ProductDto;
import com.ricoom.shop.models.Category;
import com.ricoom.shop.models.Product;
import com.ricoom.shop.productRepositories.CategoryRepository;
import com.ricoom.shop.productRepositories.ProductRepository;
import com.ricoom.shop.productService.ProductService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
private ProductRepository productRepo;
private CategoryRepository categoryRepository;
	
	@Override
	public ProductDto addProduct(ProductDto product) {
		Category existingCategory = categoryRepository.findBycategoryname(product.getCategory().getCategoryname());
		Product _product=new Product();
		_product.setTitle(product.getTitle());
		_product.setPrice(product.getPrice());
		_product.setDescription(product.getDescription());
		_product.setDicountPercentage(product.getDicountPercentage());
		_product.setBrand(product.getBrand());
		_product.setStock(product.getStock());
		_product.setRating(product.getRating());

        if (existingCategory != null) {
            // If the category exists, associate the product with the existing category
            _product.setCategory(existingCategory);
        } else {
            // If the category does not exist, create a new category and associate it with the product
            Category newCategory = new Category();
            newCategory.setCategoryname(product.getCategory().getCategoryname());
            categoryRepository.save(newCategory);

            _product.setCategory(newCategory);// Handles bidirectional relationship
        }
		
        productRepo.save(_product);
		return product;
	}
 
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findBycategoty(Category categoryName) {
		return productRepo.findBycategory(categoryName);
	}

	@Override
	public Category createCategory(String categoryname) {
		
		return null;
	}

}
