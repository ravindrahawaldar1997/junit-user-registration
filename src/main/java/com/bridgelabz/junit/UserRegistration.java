package com.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isValidFirstName(String firstName) {

        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }
    public static boolean isValidLastName(String lastName) {

        String lastNameRegex = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }
    public static boolean isValidEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,4}([.][a-z]{2,4})*$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    public static boolean isValidMobileNumber(String mobileNumber) {

        String mobileNumberRegex = ("^[+][0-9]{2}[\\s][0-9]{10}$");

        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);

        return matcher.matches();
    }
}
