package com.mp.app.bundle.dao;


import com.mp.app.bundle.models.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products, Long> {
}
