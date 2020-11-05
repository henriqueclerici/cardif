package com.luiz.cardif.service;

import java.util.Optional;

import com.luiz.cardif.entity.Cargo;

public interface CargoService {
    Cargo createOrUpdate(Cargo cargo);

    Optional<Cargo> findById(String id);

    void delete();
    
    Cargo findByCargoName(String name);
}
