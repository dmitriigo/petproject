package com.example.databases.rest;

import com.example.databases.jpa.UserRepo;
import com.example.databases.models.User;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@AllArgsConstructor
public class FinanceRest {

    private UserRepo userRepo;

    @GetMapping("/get")
    public List<User> get() {
        return userRepo.findAll();
    }
}
