package vn.devmaster.lab02.pkg_annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.devmaster.lab02.pkg_annotation.AppConfig;

@RestController
public class MyBean {
    @Autowired
    private final AppConfig appConfig;

    public MyBean(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/my-bean")
    public String myBean() {
        return appConfig.appName()  ;
    }
}
