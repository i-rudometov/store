package com.store.simple.controller;

import com.store.simple.models.Price;
import com.store.simple.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/price")
public class PriceController {

    @Autowired
    PriceRepository priceRepository;

    @PostMapping("/create")
    public void setPrice(
            @RequestParam("id") long id,
            @RequestParam("price") double productPrice,
            @RequestParam("begin-date") Date beginDate,
            @RequestParam("end-date") Date endDate) {
        Price price = new Price(id, productPrice, beginDate, endDate);
        priceRepository.save(price);

    }
}
