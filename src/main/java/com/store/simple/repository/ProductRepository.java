package com.store.simple.repository;

import com.store.simple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p.name, ps.price, ps.beginDate, ps.endDate FROM Product p INNER JOIN  Price ps ON ps.product = p.id" )
    List<Object[]> findAllProducts();

    @Query("SELECT p.name, ps.price, ps.beginDate, ps.endDate FROM Product p INNER JOIN Price ps ON ps.product = p.id WHERE ps.beginDate < :date AND ps.endDate > :date" )
    List<Object[]> findAllProductsInDate(@Param("date") String date);

}
