package com.store.simple.repository;

import com.store.simple.models.Price;
import com.store.simple.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PriceRepository extends CrudRepository<Price, Long> {
}
