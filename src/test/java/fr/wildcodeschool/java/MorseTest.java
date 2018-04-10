package fr.wildcodeschool.java;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseTest {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		Morse morse = new Morse();
		assertEquals("WILD", morse.convert(".-- .. .-.. -.."));
	}
	
	@Test
	public void test2() throws Exception {
		Morse morse = new Morse();
		assertEquals("WILD CODE", morse.convert(".-- .. .-.. -..   -.-. --- -.. ."));
	}
}
