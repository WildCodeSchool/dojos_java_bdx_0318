package fr.wildcodeschool.java;

// TODO: Replace examples and use TDD development by writing your own tests

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpandNumberTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", ExpandNumber.expandedForm(12));
        assertEquals("40 + 2", ExpandNumber.expandedForm(42));
        assertEquals("70000 + 300 + 4", ExpandNumber.expandedForm(70304));
    }
}