package com.devmaster.lab08.controller;

import com.devmaster.lab08.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products() {
        return "product";
    }
}
