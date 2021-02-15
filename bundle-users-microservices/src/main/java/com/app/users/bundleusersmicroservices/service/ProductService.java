package com.app.users.bundleusersmicroservices.service;

import com.app.users.bundleusersmicroservices.dao.ProductDao;
import com.app.users.bundleusersmicroservices.models.Products;
import com.app.users.bundleusersmicroservices.utils.GenericServiceImpl;
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
