package com.example.projet1_packvehicule.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
public class Papier {
    @Id
    private long id;
    private Date date_assurance;
    private Date date_vignette;
    private Date date_visiteTechnique;
    @OneToOne
    private Voiture voiture;
}
