package tn.esprit.pi.services;

import tn.esprit.pi.entities.Terrain;

import java.util.List;

public interface ITerrainServices {
    Terrain addTerrain(Terrain terrain);
    Terrain updateTerrain(Terrain terrain);
    void delete(int numterrain);
    Terrain getById(int numterrain);
    List<Terrain> getAll();
}
