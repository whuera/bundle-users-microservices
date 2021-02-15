package com.app.users.bundleusersmicroservices.controller;

import com.app.users.bundleusersmicroservices.models.Products;
import com.app.users.bundleusersmicroservices.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductsController {
    @Autowired
    IProductService productService;
    @GetMapping("/all")
    public List<Products> getAll(){
        return productService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Products findById(@PathVariable Long id){
        return productService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Products> save(@RequestBody Products products){
        Products obj = productService.save(products);
        return new ResponseEntity<Products>(obj, HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Products> delete(@PathVariable Long id) {
        Products products = productService.get(id);
        if (products != null) {
            productService.delete(id);
        }else {
            return new ResponseEntity<Products>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Products>(products, HttpStatus.OK);
    }
}
