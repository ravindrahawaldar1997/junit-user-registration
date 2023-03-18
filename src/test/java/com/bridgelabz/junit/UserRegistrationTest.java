package com.bridgelabz.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidFirstName("Ravi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidFirstName("d");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidLastName("Hawaldar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidLastName("r");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_whenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidEmail("ravi@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidEmail("ravi12...");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_whenValidShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidMobileNumber("+91 7975301655");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidMobileNumber("+91 12345");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_whenValidShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPassword("ravindraadcac");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPassword("ravi");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordOneUpperCase_whenValidShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPasswordWithOneUpperCase("AashbdyhlijGH");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordWithOneUpperCase_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPasswordWithOneUpperCase("wdfasd123");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordWithOneNumber_whenValidShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPasswordWithOneNumeric("Ajhvjhbv1235");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordWithOneNumber_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPasswordWithOneNumeric("wsadfg");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordWithOneSpecialChar_whenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPasswordWithOneSpecialChar("RzxcAvi$jhbzjkh123");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordWithOneSpecialChar_whenValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPasswordWithOneSpecialChar("zxvasdasffa");
        Assertions.assertFalse(result);
    }

    @Test
    void givenValidEmailSamples_WhenTested_ShouldReturnTrue() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

         UserRegistration userRegistration= new UserRegistration();
        for (int i = 0; i < validEmails.length; i++) {
            boolean result = userRegistration.verifyEmailSamples(validEmails[i]);
            Assertions Assert = null;
            Assert.assertTrue(result);
        }
    }

    @Test
    void givenInvalidEmailSamples_WhenTested_ShouldReturnFalse() {
        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        UserRegistration userRegistration = new UserRegistration();
        for (int i = 0; i < inValidEmails.length; i++) {
            boolean result = userRegistration.verifyEmailSamples(inValidEmails[i]);
            Assertions Assert = null;
            Assert.assertFalse(result);
        }
    }

}
