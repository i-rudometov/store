package com.store.simple.repository;

import com.store.simple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p.name, ps.price, ps.date_begin, ps.date_end FROM Product p INNER JOIN  Price ps ON ps.product_id = p.id" )
    List<Product> findAllProducts();

}
