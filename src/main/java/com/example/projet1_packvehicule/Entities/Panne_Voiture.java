package com.example.projet1_packvehicule.Entities;

import com.example.projet1_packvehicule.Enums.TypePanne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Panne_Voiture {
    @Id
    private long id;
    private TypePanne typePanne;
    private boolean resolu;
    private String description;
    @ManyToOne
    private Voiture voiture;

}
