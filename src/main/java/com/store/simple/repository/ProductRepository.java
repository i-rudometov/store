package com.store.simple.repository;

import com.store.simple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p.name, ps.price, ps.beginDate, ps.endDate FROM Product p INNER JOIN  Price ps ON ps.product = p.id" )
    List<Object[]> findAllProducts();

}
