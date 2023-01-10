package com.example.projet1_packvehicule.Repositories;

import com.example.projet1_packvehicule.Entities.Panne_Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanneRepository extends JpaRepository<Panne_Voiture,Long> {
}
