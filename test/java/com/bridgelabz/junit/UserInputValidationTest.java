package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserInputValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Ravi");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Pr");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Hawaldar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("So");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("hawaldarravindra@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("Ravindra..675.gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("91 9087654321");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("908765-4321908");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("ravindra");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("Ravi123");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordWithOneUpperCHar_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordOneUpperChar("Ravindrash");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordWithOneUpperCHar_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordOneUpperChar("ravi");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordWithNumeric_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithNumeric("Ravindra123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordWithNumeric_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithNumeric("ravi@456");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordWithSpecialChar_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithSpecialChar("Ravindra123@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordWithSpecialChar_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPasswordWithSpecialChar("ravi@456..");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenValidEmail_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("ravi@gamil.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenValidEmail_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("ravi@..gamil.com.al");
        Assert.assertEquals(false, result);
    }
}