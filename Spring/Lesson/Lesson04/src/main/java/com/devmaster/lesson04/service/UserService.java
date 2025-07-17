package com.devmaster.lesson04.service;

import com.devmaster.lesson04.dto.UserDTO;
import com.devmaster.lesson04.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<User>();

    public UserService() {
        boolean b = userList.addAll(Arrays.asList(
                new User(1L, "user1", "pass1", "John Doe", LocalDate.parse("1990-01-01"), "john@example.com", "1234567890", 34, true),
                new User(2L, "user2", "pass2", "Jane Smith", LocalDate.parse("1992-05-15"), "jane@example.com", "0987654321", 32, false),
                new User(3L, "user3", "pass3", "Alice Johnson", LocalDate.parse("1985-11-22"), "alice@example.com", "1122334455", 39, true),
                new User(4L, "user4", "pass4", "Bob Brown", LocalDate.parse("1988-03-18"), "bob@example.com", "6677889900", 36, true),
                new User(5L, "user5", "pass5", "Charlie White", LocalDate.parse("1995-09-30"), "charlie@example.com", "4433221100", 29, false)
        ));
    }

    public List<User> findAll() {
        return userList;
    }

    public Boolean create(UserDTO userDTO) {
        try {
            User user = new User();
            user.setId((long) userList.size() + 1);
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setEmail(userDTO.getEmail());
            user.setFullName(userDTO.getFullName());
            user.setPhone(userDTO.getPhone());
            user.setAge(userDTO.getAge());
            user.setBirthDay(userDTO.getBirthday());
            user.setStatus(userDTO.getStatus());
            userList.add(user);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}