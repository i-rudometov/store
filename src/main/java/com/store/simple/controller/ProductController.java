package com.store.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/create")
    public void createProduct(
            @RequestParam("name") String productName,
            @RequestParam("price") double productPrice,
            Model model) {


    }

    @DeleteMapping("/remove")
    public void removeProduct(
            @RequestParam("id") int id,
            Model model) {

    }

    @GetMapping("/all")
    public String getAllProducts(
            @RequestParam(value = "date", required = false) Date date,
            Model model) {

        return null;
    }
}
