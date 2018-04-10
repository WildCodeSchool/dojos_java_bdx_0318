package fr.wildcodeschool.java;

// TODO: Replace examples and use TDD development by writing your own tests

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpandNumberTest {
    @Test
    public void testExpand1() {
        assertEquals("10 + 2", ExpandNumber.expandedForm1(12));
        assertEquals("40 + 2", ExpandNumber.expandedForm1(42));
        assertEquals("70000 + 300 + 4", ExpandNumber.expandedForm1(70304));
    }

    @Test
    public void testExpand2() {
        assertEquals("10 + 2", ExpandNumber.expandedForm2(12));
        assertEquals("40 + 2", ExpandNumber.expandedForm2(42));
        assertEquals("70000 + 300 + 4", ExpandNumber.expandedForm2(70304));
    }

    @Test
    public void testExpand3() {
        assertEquals("10 + 2", ExpandNumber.expandedForm3(12));
        assertEquals("40 + 2", ExpandNumber.expandedForm3(42));
        assertEquals("70000 + 300 + 4", ExpandNumber.expandedForm3(70304));
    }

    @Test
    public void testExpand4() {
        assertEquals("10 + 2", ExpandNumber.expandedForm4(12));
        assertEquals("40 + 2", ExpandNumber.expandedForm4(42));
        assertEquals("70000 + 300 + 4", ExpandNumber.expandedForm4(70304));
    }
}