package com.store.simple.repository;

import com.store.simple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p.id FROM Product p where p.name= :name" )
    Long findByName(@Param("name") String name);

    void deleteByName(String name);
}
