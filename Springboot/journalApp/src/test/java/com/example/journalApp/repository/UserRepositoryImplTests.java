package com.example.journalApp.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryImplTests {

    @Autowired
    private UserRepositoryimpl userRepositary;

    @Disabled("tested")
    @Test
    void testSaveNewUser() {
        Assertions.assertNotNull(userRepositary.getUserForSA());
    }
}
