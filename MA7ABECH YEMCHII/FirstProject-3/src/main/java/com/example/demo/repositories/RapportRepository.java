package com.example.demo.repositories;

import com.example.demo.models.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Long> {
    
    List<Rapport> findByIdUser(Long userId);
    List<Rapport> findByIdManager(Long managerId);
}