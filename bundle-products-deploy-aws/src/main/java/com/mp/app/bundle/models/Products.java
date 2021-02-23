package com.mp.app.bundle.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
public class Products {
    public Products(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdProduct;
    private String codProduct;
    private String nameProduct;
    private String descProduct;
    private String specificationsProduct;
    private int quantityProduct;
    private double costProduct;
    private String urlImageProduct;
    private int statusProduct;
}
