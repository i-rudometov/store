package com.store.simple.controller;

import com.store.simple.models.Price;
import com.store.simple.models.Product;
import com.store.simple.repository.PriceRepository;
import com.store.simple.repository.ProductRepository;
import com.store.simple.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    PriceRepository priceRepository;

    @Autowired
    IProductService productService;

    @PostMapping("/create")
    public void createProduct(
            @RequestParam("name") String name,
            @RequestParam("price") double productPrice) {

        Product product = new Product(name);
        productRepository.save(product);
        Long productId = productRepository.findByName(name);
        Price price = new Price(productId, productPrice);
        priceRepository.save(price);
    }

    @GetMapping("/remove")
    public void removeProduct( @RequestParam("id") long id) {
        productRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(
            @RequestParam(value = "date", required = false) Date date) {
        List<Product> products = (List<Product>) productService.findAll();
        return products;
    }
}
