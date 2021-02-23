package com.mp.app.bundle.service;


import com.mp.app.bundle.dao.ProductDao;
import com.mp.app.bundle.models.Products;
import com.mp.app.bundle.utils.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService extends GenericServiceImpl<Products, Long> implements IProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public CrudRepository<Products, Long> getDao() {
        return productDao;
    }
}
