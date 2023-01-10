package com.example.projet1_packvehicule.Iservice;

import com.example.projet1_packvehicule.Entities.Voiture;
import java.util.*;
public interface Service_voiture {
     public List<Voiture> listeVoitures();
     public Voiture getVoiture(Long id);
     public Voiture saveVoiture(Voiture voiture);
     public Voiture updateVoiture(Long id);
}
