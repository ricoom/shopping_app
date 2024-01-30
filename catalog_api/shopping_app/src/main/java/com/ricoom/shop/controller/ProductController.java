package com.ricoom.shop.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ricoom.shop.Dtos.ProductDto;
import com.ricoom.shop.Dtos.ProductsPage;
import com.ricoom.shop.models.Category;
import com.ricoom.shop.models.Product;
import com.ricoom.shop.servicesImpl.ProductServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {
private ProductServiceImpl productService;
@PostMapping("/addProduct")
public ResponseEntity<ProductDto> addNewProduct(@RequestBody ProductDto product) {
	
	
	return new ResponseEntity<ProductDto>(productService.addProduct(product),HttpStatus.OK);
}
@GetMapping("/products/{category}")
public ResponseEntity<List<Product>> findOneProductByCat(@PathVariable String category) {
	
	
	return new ResponseEntity<List<Product>>(productService.findBycategoty(category),HttpStatus.OK);
}
//@GetMapping("/products")
//public ResponseEntity<List<Product>> findAll() {
//	
//	return new ResponseEntity<List<Product>>(productService.getProducts(),HttpStatus.OK);
//}
@GetMapping("/products")
public ResponseEntity<ProductsPage> findAllPaged(
		@RequestParam(defaultValue = "0",required = false)int pageNumber,
		@RequestParam(defaultValue = "5", required = false) int pageSize) {
	return new ResponseEntity<ProductsPage>(productService.getpageProducts(pageNumber, pageSize), HttpStatus.OK);
}

}
