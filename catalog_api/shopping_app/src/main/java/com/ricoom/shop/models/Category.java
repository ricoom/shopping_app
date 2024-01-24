package com.ricoom.shop.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@RequiredArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long categoryId;
private String categoryname;

@OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
private List<Product> products = new ArrayList<>();

public Category(String categoryname) {
	this.categoryname = categoryname;
}




}
