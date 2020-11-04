package com.luiz.cardif.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.Cargo;
import com.luiz.cardif.repository.CargoRepository;
import com.luiz.cardif.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService {
    
    private final CargoRepository repository;
    
    @Autowired
    public CargoServiceImpl(final CargoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cargo createOrUpdate(Cargo cargo) {
        return repository.save(cargo);
    }

    @Override
    public Optional<Cargo> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id); 
    }

}
