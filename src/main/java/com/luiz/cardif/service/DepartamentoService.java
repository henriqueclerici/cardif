package com.luiz.cardif.service;

import java.util.Optional;

import com.luiz.cardif.entity.Departamento;

public interface DepartamentoService {

    Departamento createOrUpdate(Departamento user);

    Optional<Departamento> findById(String id);

    void delete(String id);
    
}
