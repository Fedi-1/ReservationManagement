package com.example.demo.services;

import com.example.demo.models.Terrain;
import com.example.demo.repositories.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerrainService {
    
    @Autowired
    private TerrainRepository terrainRepository;
    
    public Terrain createTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }
    
    public List<Terrain> getAllTerrains() {
        return terrainRepository.findAll();
    }

    public List<Terrain> getTerrainsByManagerId(Long managerId) {
        return terrainRepository.findByManagerId(managerId);
    }

    public Terrain getTerrainById(Long id) {
        return terrainRepository.findById(id).orElse(null);
    }

    public Terrain updateTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }

    public void deleteTerrain(Long id) {
        terrainRepository.deleteById(id);
    }
}
