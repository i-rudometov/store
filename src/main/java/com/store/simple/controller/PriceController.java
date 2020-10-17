package com.store.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/price")
public class PriceController {

    @PostMapping("/create")
    public void setPrice(
            @RequestParam("id") int id,
            @RequestParam("price") double productPrice,
            @RequestParam("begin-date") Date beginDate,
            @RequestParam("end-date") Date endDate
            , Model model) {

    }
}
