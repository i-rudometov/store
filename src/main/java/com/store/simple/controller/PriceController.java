package com.store.simple.controller;

import com.store.simple.models.Price;
import com.store.simple.models.Product;
import com.store.simple.repository.PriceRepository;
import com.store.simple.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    PriceRepository priceRepository;

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/create")
    public void setPrice(
            @RequestParam("price") double productPrice,
            @RequestParam("begin-date") String bDate,
            @RequestParam("end-date") String eDate,
            @RequestParam("id") String id ) {

        try {
            Long productID = Long.parseLong(id);
            Product product = productRepository.getOne(productID);
            Date beginDate = new SimpleDateFormat("yyyy-MM-dd").parse(bDate);
            Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(eDate);
            Price price = new Price(productPrice, beginDate, endDate, product);
            priceRepository.save(price);
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
