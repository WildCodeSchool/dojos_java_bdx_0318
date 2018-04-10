package fr.wildcodeschool.java;

public class Voiture implements VehiculeAEssence {

    private int vitesse;
    private float jauge;
    private final static float CONSOMMATION = 5.f;

    public Voiture(float jauge) {
        this.jauge = jauge;
    }

    @Override
    public int getNombreDeRoues() {
        return 4;
    }

    /**
     *
     * @param vitesse
     * @param dureEnHeure
     * @throws VehiculeASecException il n'y a plus d'essence
     */
    @Override
    public void rouler(int vitesse, int dureEnHeure) throws VehiculeASecException {
        this.vitesse = vitesse;
        float essenceConsomme = (vitesse * dureEnHeure * CONSOMMATION)/100;
        jauge = jauge - essenceConsomme;
        if (jauge <= 0){
            throw new VehiculeASecException();
        }
    }

    @Override
    public float getDistanceRestante() {
        return jauge / CONSOMMATION;
    }

    @Override
    public float getEssence() {

        return jauge;
    }

    @Override
    public float ajouterEssence(float quantite) {
        jauge= jauge + quantite;
        return jauge;
    }
}
