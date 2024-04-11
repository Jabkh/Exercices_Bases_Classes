package org.example;

import org.example.Chaise.Chaise;
import org.example.Film.Film;
import org.example.Joueur.Joueur;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//            Chaise chaise1 = new Chaise(4, "grise", 15.0f, "chêne");
//            Chaise chaise2 = new Chaise(3, "noir", 15.0f, "bambou");
//            Chaise chaise3 = new Chaise(1, "marron", 15.0f, "métal");
//            System.out.println(chaise1.toString());
//            System.out.println(chaise2.toString());
//            System.out.println(chaise3.toString());


//        Film film1 = new Film();
//        film1.setTitre("Interstella 5555");
//        film1.setRealisateur("Kazuhisa Takenouchi");
//        film1.setDateSortie(LocalDate.of(2003, 05, 8));
//        film1.setGenre("Science-fiction");
//        Film film2 = new Film();
//        film2.setTitre("Matrix");
//        film2.setRealisateur("Les Wachowskis");
//        film2.setDateSortie(LocalDate.of(1999, 05, 8));
//        film2.setGenre("Science-fiction");
//
//
//        System.out.println(film1.toString());
//        System.out.println(film2.toString());

        Joueur joueur = new Joueur("Red");
        System.out.println(joueur);
        joueur.effectuerUneQuete();
        System.out.println("Quête réussie :");
        System.out.println(joueur);
        joueur.setPointsExperience(150);
        joueur.monterDeNiveau();
        System.out.println("Après avoir monté de niveau :");
        System.out.println(joueur);
    }
}