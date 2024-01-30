package com.ricoom.shop.productRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricoom.shop.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	 Category findBycategoryname(String categoryname);
	
}
