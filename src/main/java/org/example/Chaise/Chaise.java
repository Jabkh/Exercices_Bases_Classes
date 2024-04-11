package org.example.Chaise;

public class Chaise {
    private final int nombrePieds;
    private final String couleur;
    private final float prix;

    private final String type;

    public Chaise() {
        this(4, "blanche", 8.0f, "plastique");
    }

    public Chaise(int nombrePieds, String couleur, float prix, String t) {
        this.nombrePieds = nombrePieds;
        this.couleur = couleur;
        this.prix = prix;
        type = t;
    }

    public String toString() {
        return "Je suis une chaise avec \n" + this.nombrePieds + " pied(s)\n en " + this.type + "\n de couleur "
                + this.couleur + "\n à un prix de " + this.prix + " euros";
    }

}
