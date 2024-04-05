package com.evaluation.AccesBDD;

import java.sql.Connection;

public class AccesBdd {

    private static String nom = "tache";
    private static String serveur = "localhost";
    private static int port = 3306;
    private static String urlConnexion = "jdbc:mysql://" + serveur + ":" + port + "/" + nom;
    private static String nomUtilisateur = "root";
    private static String mdpUtilisateur = "azerty";

}
