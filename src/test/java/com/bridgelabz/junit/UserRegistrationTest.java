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
}
