package com.luiz.cardif.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.luiz.cardif.entity.Cargo;

public interface CargoRepository extends MongoRepository<Cargo, String> {
    
    Cargo findByCargoNameIgnoreCaseContaining(String name);
    

}
