package org.lvl3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LocalUITest
{

    @BeforeEach
    void setUp()
    {
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    void getUserInput_validInput()
    {
        //Arrange
        int expected = 42;
        String input = "42\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        LocalUI localUI = new LocalUI(in);

        //Act
        int result = localUI.getUserInput();

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void getUserInput_invalidFollowedByValidInput()
    {
        //Arrange
        int expected = 42;
        String input = "a\n4.2\nb\n42\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        LocalUI localUI = new LocalUI(in);

        //Act
        int result = localUI.getUserInput();

        //Assert
        assertEquals(expected, result);

    }
    @Test
    void getUserInput_onlyInvalidInput()
    {
        //Arrange
        int expected = 0;
        String input = "a\n4.2\nb\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        LocalUI localUI = new LocalUI(in);

        //Act
        int result = localUI.getUserInput();

        //Assert
        assertEquals(expected, result);

    }
}