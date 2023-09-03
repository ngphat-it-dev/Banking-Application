package com.example.banking_application.service;

import com.example.banking_application.dto.BankResponse;
import com.example.banking_application.dto.CreditDebitRequest;
import com.example.banking_application.dto.EnquiryRequest;
import com.example.banking_application.dto.UserRequest;
import com.example.banking_application.entity.User;

import java.util.List;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
