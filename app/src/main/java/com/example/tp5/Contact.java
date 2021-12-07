package com.example.tp5;

public class Contact {
    public Contact(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        //this.url = url;
    }

    String nom;
    String prenom;
    String url;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
