package com.store.simple.repository;

import com.store.simple.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PriceRepository extends JpaRepository<Price, Long> {

}
