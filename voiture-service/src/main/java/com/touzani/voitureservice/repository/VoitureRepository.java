package com.touzani.voitureservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.touzani.voitureservice.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
