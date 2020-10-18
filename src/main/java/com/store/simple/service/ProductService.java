package com.store.simple.service;

import com.store.simple.models.Product;
import com.store.simple.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {

        return (List<Product>) productRepository.findAll();
    }

}
