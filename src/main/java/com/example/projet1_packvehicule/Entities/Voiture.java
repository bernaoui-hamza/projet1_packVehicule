package com.example.projet1_packvehicule.Entities;

import com.example.projet1_packvehicule.Enums.Categorie;
import com.example.projet1_packvehicule.Enums.Energie;
import com.example.projet1_packvehicule.Enums.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Voiture {
    @Id
    private String id;
    private  String marque;
    private String modele;
    private Categorie categorie;
    private Energie energie;
    private Etat etat;
    private long prixJour;
    private Date dateCirculation;
    private int kilometrage;
    @OneToMany(mappedBy = "voiture")
    private List<Panne_Voiture> panne_voitures;
    @OneToOne
    private Papier papier;




}
