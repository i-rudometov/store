package com.store.simple.controller;

import com.store.simple.models.Price;
import com.store.simple.models.Product;
import com.store.simple.repository.PriceRepository;
import com.store.simple.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    PriceRepository priceRepository;

    @PostMapping("/create")
    public void createProduct(
            @RequestParam("name") String name,
            @RequestParam("price") double productPrice) {

        Product product = new Product(name);
        Price price = new Price(productPrice);
        product.setPrice(Collections.singletonList(price));
        priceRepository.save(price);

    }

    @GetMapping("/remove")
    public void removeProduct( @RequestParam("id") String id) {
        productRepository.deleteById(Long.getLong(id));
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(
            @RequestParam(value = "date", required = false) Date date) {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
