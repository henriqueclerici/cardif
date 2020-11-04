package com.luiz.cardif.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.luiz.cardif.entity.FuncionarioDepartamento;

public interface HistoricoRepository extends MongoRepository<FuncionarioDepartamento, String> {
    
    
    List<FuncionarioDepartamento> findByFuncionarioId(String id);

}
