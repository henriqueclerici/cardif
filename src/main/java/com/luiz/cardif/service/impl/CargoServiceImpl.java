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
    private final NextSequenceService nextSequenceService;
    
    @Autowired
    public CargoServiceImpl(final CargoRepository repository, final NextSequenceService nextSequenceService) {
        this.repository = repository;
        this.nextSequenceService = nextSequenceService;
    }

    @Override
    public Cargo createOrUpdate(Cargo cargo) {
        cargo.setCargoId(String.valueOf(nextSequenceService.generateSequence(Cargo.SEQUENCE_NAME)));
        return repository.save(cargo);
    }

    @Override
    public Optional<Cargo> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete() {
        repository.deleteAll();
    }

    @Override
    public Cargo findByCargoName(String name) {      
        return repository.findByCargoNameIgnoreCaseContaining(name);
    }

}
