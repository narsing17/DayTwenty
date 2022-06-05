package com.userregistration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Narsing");
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateLastName("Kadam");
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateEmail("narsingp14@gmail.com");

    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 9028546171");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithOutSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("919028546171");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("9190");
        Assertions.assertFalse(phoneNumber);
    }

    @Test
    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Jio@123");
        Assertions.assertTrue(password);
    }
}

