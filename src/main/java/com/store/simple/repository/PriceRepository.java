package com.store.simple.repository;

import com.store.simple.models.Price;
import com.store.simple.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PriceRepository extends JpaRepository<Price, Long> {

}
