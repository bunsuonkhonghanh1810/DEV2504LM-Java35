package com.devmaster.lesson07.controller;

import com.devmaster.lesson07.entity.Product;
import com.devmaster.lesson07.service.CategoryService;
import com.devmaster.lesson07.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String listProduct(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product/product-list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "product/product-form";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("product", productService.findById(id).orElse(null));
        model.addAttribute("categories", categoryService.getAllCategories());
        return "product/product-form";
    }

    @PostMapping("/create")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/product";
    }

    @PostMapping("/create/{id}")
    public String updateProduct(@PathVariable(value = "id") Long id, @ModelAttribute("product") Product product) {
        product.setId(id);
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(value = "id") Long id) {
        productService.deleteProduct(id);
        return "redirect:/product";
    }
}
