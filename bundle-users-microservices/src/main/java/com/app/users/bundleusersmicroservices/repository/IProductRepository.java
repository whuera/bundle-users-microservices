package com.app.users.bundleusersmicroservices.repository;

import com.app.users.bundleusersmicroservices.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Products, Long> {
}
