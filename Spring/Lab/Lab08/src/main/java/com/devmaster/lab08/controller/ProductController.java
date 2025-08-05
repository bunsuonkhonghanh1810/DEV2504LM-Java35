package com.devmaster.lab08.controller;

import com.devmaster.lab08.dto.ProductDTO;
import com.devmaster.lab08.entity.Product;
import com.devmaster.lab08.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.findAll());
        model.addAttribute("product", new Product());
        return "product";
    }

    @PostMapping("/products")
    public String addProduct(@ModelAttribute ProductDTO product) {
        productService.save(product);
        return "redirect:/home/products";
    }
}
