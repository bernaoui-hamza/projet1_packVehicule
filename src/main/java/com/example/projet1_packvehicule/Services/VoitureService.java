package com.example.projet1_packvehicule.Services;

import com.example.projet1_packvehicule.Entities.Voiture;
import com.example.projet1_packvehicule.Iservice.Service_voiture;
import com.example.projet1_packvehicule.Repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
public class VoitureService implements Service_voiture {
    @Autowired
VoitureRepository voitureRepository;


    @Override
    public List<Voiture> listeVoitures() {
        List<Voiture> voitures=voitureRepository.findAll();
        return  voitures;
    }

    @Override
    public Voiture getVoiture(Long id) {
        Voiture v=voitureRepository.findById(id).get();
        return v;
    }

    @Override
    public Voiture saveVoiture(Voiture voiture) {
        return null;
    }

    @Override
    public Voiture updateVoiture(Long id) {
        return null;
    }
}
