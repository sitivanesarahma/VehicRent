package com.TubesRpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TubesRpl.vehicrent.backend.models.Rekomendasi;

@Repository
public interface RekomendasiRepository extends JpaRepository<Rekomendasi, Integer>{
    
}
