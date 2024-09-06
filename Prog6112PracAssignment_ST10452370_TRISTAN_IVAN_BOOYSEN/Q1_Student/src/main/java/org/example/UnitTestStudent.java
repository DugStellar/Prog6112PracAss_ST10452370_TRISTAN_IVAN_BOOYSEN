package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTestStudent {

    @Test
    public void testSaveStudent() {
        // ... (existing test case)
    }

    @Test
    public void testSearchStudent() {
        // ... (existing test case)
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        // ... (existing test case)
    }

    @Test
    public void testDeleteStudent() {
        // ... (existing test case)
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        // ... (existing test case)
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        // Create a student with a valid age
        Student student = new Student("S123", "John Doe", 20, "johndoe@example.com", "Computer Science");

        // Verify that the age is valid
        assertTrue(student.getAge() >= 16);
    }

    @Test
    public void testStudentAge_StudentAgeInvalid() {
        // Create a student with an invalid age
        Student student = new Student("S123", "John Doe", 15, "johndoe@example.com", "Computer Science");

        // Verify that the age is invalid
        assertFalse(student.getAge() >= 16);
    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        // Attempt to create a student with an invalid character for age
        assertThrowsExactly(NumberFormatException.class, () -> {
            new Student("S123", "John Doe", "invalid_age", "johndoe@example.com", "Computer Science");
        });
    }
}
