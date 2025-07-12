package vn.devmaster.lab02.pkg_annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.devmaster.lab02.pkg_annotation.service.MyGreetingService;

@RestController
public class MyGreetingController {
    @Autowired
    private final MyGreetingService myGreetingService;
    public MyGreetingController(MyGreetingService myGreetingService) {
        this.myGreetingService = myGreetingService;
    }

    @GetMapping("/my-greet")
    public String greet() {
        return myGreetingService.greet();
    }
}
