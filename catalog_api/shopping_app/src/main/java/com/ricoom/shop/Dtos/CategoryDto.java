package com.ricoom.shop.Dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class CategoryDto {
	
private String categoryname;
public CategoryDto(String categoryname) {
	this.categoryname = categoryname;
}

}
