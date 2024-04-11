package org.example.Film;

import java.time.LocalDate;

public class Film {
    private String titre;
    private String realisateur;
    private LocalDate dateSortie;
    private String genre;

    public Film() {
        this("titre1", "realisateur1", LocalDate.of(1900, 1, 1), "genre1");
    }

    public Film(String titre, String realisateur, LocalDate dateSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateSortie = dateSortie;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Le film " + this.titre + " réalisé par " + this.realisateur + " en " + this.dateSortie + " est un film de genre " + this.genre;
    }


}
