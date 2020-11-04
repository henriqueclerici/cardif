package com.luiz.cardif.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.luiz.cardif.entity.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String>{

}
