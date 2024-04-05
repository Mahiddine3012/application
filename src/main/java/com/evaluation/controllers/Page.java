package com.evaluation.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.evaluation.AccesBDD.AccesBdd;
import com.evaluation.model.Tache;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Page {

  @FXML
  private Button ajouter;

  @FXML
  private Button chargement;

  @FXML
  private TextField date;

  @FXML
  private TextField description;

  @FXML
  private TextField statut;

  @FXML
  private TextField titre;

  private Tache tache;

  @FXML
  void id_Btn_Ajouter(ActionEvent event) {

  }

  @FXML
  String id_Btn_Chargement(ActionEvent event) {

  }
  

  public static Tache getTache() {
    Connection conn = AccesBdd.getConnection();
    // On sort immédiatement si la connexion a échoué
    if (conn == null) {
      return null;
    }

    Tache tache = null;

    try {
      String sql = "SELECT * FROM application.tache WHERE id = 1; ";
      Statement requete = conn.createStatement();
      ResultSet res = requete.executeQuery(sql);
      // On parcourt le ResultSet
      while (res.next()) {
        // On récupère chaque tache

        String titre = res.getString("titre");

        String description = res.getString("descrption");

        String date = res.getString("date");

        String statut = res.getString("statut");

        // On instancie un objet Tache
        tache = new Tache(titre, description, date, statut);

      }
    } catch (Exception e) {
      System.out.println("erreur req tache");
    }
   
  }}