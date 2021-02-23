package com.mp.app.bundle.repository;


import com.mp.app.bundle.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Products, Long> {
}
