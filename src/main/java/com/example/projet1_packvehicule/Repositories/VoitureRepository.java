package com.example.projet1_packvehicule.Repositories;

import com.example.projet1_packvehicule.Entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
