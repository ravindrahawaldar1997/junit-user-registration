package com.bridgelabz.junit;

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

    public static boolean isValidPassword(String password) {

        String passwordRegex = ("^[a-zA-z]{8,}");

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static boolean isValidPasswordWithOneUpperCase(String password) {

        String passwordRegex = ("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static boolean isValidPasswordWithOneNumeric(String password) {

        String passwordRegex = ("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+${8,}");

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static boolean isValidPasswordWithOneSpecialChar(String password) {

        String passwordRegex = ("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*., ?]).+${8,}");

        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public boolean verifyEmailSamples(String validEmail) {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (int i = 0; i < validEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", validEmails[i]));
        }
        System.out.println("\nFor Invalid Emails ");
        for (int i = 0; i < inValidEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", inValidEmails[i]));
        }
        return false;
    }
    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        return "happy";
    }
}