package fr.wildcodeschool.java;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DnaTest {
    @Test
    public void test01() {
        assertEquals("TTTT", fr.wildcodeschool.java.DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }


    @Test
    public void test04() {
        assertEquals("TTTT", DnaStrand2.makeComplement("AAAA"));
    }
    @Test
    public void test05() {
        assertEquals("TAACG", DnaStrand2.makeComplement("ATTGC"));
    }
    @Test
    public void test06() {
        assertEquals("CATA", DnaStrand2.makeComplement("GTAT"));
    }
}