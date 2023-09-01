package com.example.banking_application.service;

import com.example.banking_application.dto.EmailDetails;

public interface EmailService {
    // Method
    // To send a simple email
    void sendSimpleMail(EmailDetails details);
}
