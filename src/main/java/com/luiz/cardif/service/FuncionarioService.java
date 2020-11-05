package com.luiz.cardif.service;

import java.util.Optional;

import com.luiz.cardif.entity.Departamento;
import com.luiz.cardif.entity.Funcionario;

public interface FuncionarioService {
    
    Funcionario createOrUpdate(Funcionario user);
    
    Funcionario updateFuncionario(String id, Departamento departamento);

    Optional<Funcionario> findById(String id);

    void delete();
    
    Funcionario findByFuncionarioName(String name);


}
