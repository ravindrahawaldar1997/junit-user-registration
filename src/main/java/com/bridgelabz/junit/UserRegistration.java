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

}
