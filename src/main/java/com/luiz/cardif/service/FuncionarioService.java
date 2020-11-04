package com.luiz.cardif.service;

import java.util.Optional;

import com.luiz.cardif.entity.Funcionario;

public interface FuncionarioService {
    
    Funcionario createOrUpdate(Funcionario user);

    Optional<Funcionario> findById(String id);

    void delete(String id);


}
