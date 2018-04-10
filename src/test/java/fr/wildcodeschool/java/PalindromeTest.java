package fr.wildcodeschool.java;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        Palindrome pal = new Palindrome();
        assertTrue(pal.isPalindrome("eluparcettecrapule", true));
    }

    @Test
    public void test2() throws Exception {
        Palindrome pal = new Palindrome();
        assertTrue(pal.isPalindrome("KaYAk", false));
    }

    @Test
    public void test3() throws Exception {
        Palindrome pal = new Palindrome();
        assertTrue(pal.isPalindrome("KAYAK", false));
    }

    @Test
    public void test4() throws Exception {
        Palindrome pal = new Palindrome();
        assertFalse(pal.isPalindrome(   "leonarddevinci"));
    }
}
