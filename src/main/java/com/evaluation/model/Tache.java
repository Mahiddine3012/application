package com.evaluation.model;

public class Tache {

    private String titre;
    private String description;
    private String date;
    private String statut;

    public void settitre(String titre) {
        this.titre = titre;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public void setstatut(String statut) {
        this.statut = statut;
    }

    public Tache(String titre, String description, String date, String statut) {
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.statut = statut;
    }
}