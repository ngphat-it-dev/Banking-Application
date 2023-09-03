package com.example.banking_application.controller;

import com.example.banking_application.dto.*;
import com.example.banking_application.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.banking_application.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired private EmailService emailService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping()
    public ResponseEntity<BankResponse> createAccount(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(userService.createAccount(userRequest), HttpStatus.CREATED);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, check how much the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 201 SUCCESS"
    )
    @GetMapping("balanceEnquiry")
    public ResponseEntity<BankResponse> balanceEnquiry(@RequestBody EnquiryRequest request){
        return new ResponseEntity<>(userService.balanceEnquiry(request),HttpStatus.OK) ;
    }

    @GetMapping("nameEnquiry")
    public ResponseEntity<String> nameEnquiry(@RequestBody EnquiryRequest request){
        return new ResponseEntity<>(userService.nameEnquiry(request),HttpStatus.OK);
    }

    @PostMapping("credit")
    public ResponseEntity<BankResponse> creditAccount(@RequestBody CreditDebitRequest request){
        return new ResponseEntity<>(userService.creditAccount(request),HttpStatus.OK);
    }

    @PostMapping("debit")
    public ResponseEntity<BankResponse> debitAccount(@RequestBody CreditDebitRequest request){
        return new ResponseEntity<>(userService.debitAccount(request),HttpStatus.OK);
    }
}
