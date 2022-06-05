package com.userregistration;
import org.junit.jupiter.api.Test;
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
    }
