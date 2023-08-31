package com.example.banking_application.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account Created!";
    public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";

    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created !!!";
    public static String generateAccountNumber(){
        // 2023 + Random 6 digits
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        // Generate a random number between min and max
        int randNumber =(int) Math.floor(Math.random() * (max - min + 1) + min);

        //convert the current and random number to strings, and then concatenate them
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}
