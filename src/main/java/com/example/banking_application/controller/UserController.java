package com.example.banking_application.controller;

import com.example.banking_application.dto.BankResponse;
import com.example.banking_application.dto.EmailDetails;
import com.example.banking_application.dto.EnquiryRequest;
import com.example.banking_application.dto.UserRequest;
import com.example.banking_application.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.banking_application.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired private EmailService emailService;

    @PostMapping()
    public ResponseEntity<BankResponse> createAccount(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(userService.createAccount(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("balanceEnquiry")
    public ResponseEntity<BankResponse> balanceEnquiry(@RequestBody EnquiryRequest request){
        return new ResponseEntity<>(userService.balanceEnquiry(request),HttpStatus.OK) ;
    }

    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

}
