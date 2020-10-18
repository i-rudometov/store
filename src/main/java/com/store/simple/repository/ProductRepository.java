package com.store.simple.repository;

import com.store.simple.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductRepository extends CrudRepository<Product, Long> {
    Long findByName(String name);

}
