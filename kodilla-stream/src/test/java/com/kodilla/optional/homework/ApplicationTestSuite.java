package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test
    public void protectTeacherAgainstNullShouldReturnSpecificValue(){
        Student gosia = new Student("Gosia",new Teacher("Andrzej Sojka"));
        assertNotNull(Application.protectTeacherAgainstNull(gosia));
        assertEquals("Andrzej Sojka",Application.protectTeacherAgainstNull(gosia));
    }

    @Test
    public void protectTeacherAgainstNullShouldReturnUndefinedValue(){
        Student piotr = new Student("Piotr", null);
        assertNotNull(Application.protectTeacherAgainstNull(piotr));
        assertEquals("undefined",Application.protectTeacherAgainstNull(piotr));
    }
}