package com.shopeasy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopeasy.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	public List<Product> findByProductName(String name);

	public List<Product> findByProductId(String type);

}
