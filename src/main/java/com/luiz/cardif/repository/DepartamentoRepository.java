package com.luiz.cardif.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.luiz.cardif.entity.Departamento;

public interface DepartamentoRepository extends MongoRepository<Departamento, String> {

    Departamento findByDepartamentoNameIgnoreCaseContaining(String name);
}
