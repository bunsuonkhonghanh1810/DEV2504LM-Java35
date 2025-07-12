package vn.devmaster.lab02.pkg_annotation.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserDetails() {
        return "<h1>User details</h1>";
    }
}
