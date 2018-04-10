package fr.wildcodeschool.java;

public class Velo implements Vehicule {

    private int vitesse;

    @Override
    public int getNombreDeRoues() {
        return 2;
    }

    @Override
    public void rouler(int vitesse, int dureEnHeure) {
        this.vitesse = vitesse;
    }

    @Override
    public float getDistanceRestante() {
        return Float.POSITIVE_INFINITY;
    }


}
