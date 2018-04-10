package fr.wildcodeschool.java;

import java.io.Serializable;

public interface VehiculeAEssence extends Vehicule, Serializable {

    float getEssence();

    /**
     *
     * @param quantite
     * @return quantité d'essence total
     */
    float ajouterEssence(float quantite);
}
