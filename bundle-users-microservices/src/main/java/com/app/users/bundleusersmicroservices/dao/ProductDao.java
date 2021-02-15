package com.app.users.bundleusersmicroservices.dao;

import com.app.users.bundleusersmicroservices.models.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products, Long> {
}
