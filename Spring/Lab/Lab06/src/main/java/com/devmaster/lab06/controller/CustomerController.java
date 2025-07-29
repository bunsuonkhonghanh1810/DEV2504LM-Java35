package com.devmaster.lab06.controller;

import com.devmaster.lab06.dto.CustomerDTO;
import org.springframework.ui.Model;
import com.devmaster.lab06.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        model.addAttribute("customer", new CustomerDTO());
        return "customers/customer";
    }

    @PostMapping
    public String addCustomer(@ModelAttribute("customer") CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return "redirect:/customers";
    }

    @GetMapping("/api/{id}")
    @ResponseBody
    public Optional<CustomerDTO> getCustomerById(@PathVariable Long id) {
        return Optional.ofNullable(customerService
                .findById(id)
                .orElseThrow(() -> new IllegalStateException("Invalid customer id" + id)));
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customer") CustomerDTO customerDTO) {
        customerService.update(customerDTO.getId(), customerDTO);
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") Long id) {
        customerService.delete(id);
        return "redirect:/customers";
    }
}
