package com.example.banking_application.controller;

import com.example.banking_application.dto.BankResponse;
import com.example.banking_application.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.banking_application.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseEntity<BankResponse> createAccount(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(userService.createAccount(userRequest), HttpStatus.CREATED);
    }
}
