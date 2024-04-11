package org.example.Chat;

public class Chat {
    // Attributs
    private String nom;
    private int age;
    private String race;

    // Constructeur
    public Chat(String nom, int age, String race) {
        this.nom = nom;
        this.age = age;
        this.race = race;
    }

    // Méthode pour faire miauler le chat
    public void miauler() {
        System.out.println(nom + " miaule !");
    }
}
