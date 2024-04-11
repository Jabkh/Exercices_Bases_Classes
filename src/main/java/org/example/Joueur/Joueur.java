package org.example.Joueur;

import java.time.LocalDate;

public class Joueur {
    private String nom;
    private int niveau;
    private double pointsXp;
    private double multiplicateurXp;

    public Joueur() {
        this("Blue");
    }

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String afficherNom() {
        return "Le joueur devient " + this.getNom();
    }

    public void setNom(String nom) {
        this.nom = nom;
        System.out.println(afficherNom());
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public double getPointsExperience() {
        return pointsXp;
    }

    public void setPointsExperience(double pointsXp) {
        this.pointsXp = pointsXp;
    }

    public void monterDeNiveau() {
        niveau++;
        if (pointsXp >= 200) {
            pointsXp = 0;
            niveau++;
        }
        multiplicateurXp = Math.exp(niveau / 5.0);

        System.out.println("Le joueur " + this.nom + " est monté au niveau " + this.niveau);
        System.out.println("Le multiplicateur d'xp est de " + String.format("%.2f", this.multiplicateurXp));
    }
    public int numeroQuete() {
        return (int) (Math.random() * 10);
    }
    public void effectuerUneQuete() {
        pointsXp += (20 * multiplicateurXp);
        numeroQuete();
        System.out.println("Le joueur " + this.nom + "a effectué la quête n°" + numeroQuete() + " et a gagné " + (20 * multiplicateurXp) + " points d'expérience.");

    }

    public String toString() {
        return "Le joueur " + this.nom + " est au niveau " + this.niveau + " avec " + this.pointsXp + " points d'expérience";
    }

    public static void main(String[] args) {
        Joueur joueur = new Joueur("Sacha");
        System.out.println(joueur);
        joueur.effectuerUneQuete();
        System.out.println("Quête réussie :");
        System.out.println(joueur);
        joueur.setPointsExperience(300);
        joueur.monterDeNiveau();
        joueur.setPointsExperience(150);
        joueur.monterDeNiveau();
        joueur.setPointsExperience(300);
        joueur.monterDeNiveau();
        System.out.println(joueur);
        joueur.setNom("Red");
    }
}
