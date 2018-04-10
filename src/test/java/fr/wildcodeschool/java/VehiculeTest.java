package fr.wildcodeschool.java;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculeTest {
    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        VehiculeAEssence monVehicule = new Voiture(500.0f);
        monVehicule.rouler(50,2);
        assertEquals(495.f, monVehicule.getEssence());
    }
}
