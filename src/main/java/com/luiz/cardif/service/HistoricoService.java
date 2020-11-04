package com.luiz.cardif.service;

import java.util.List;

import com.luiz.cardif.entity.FuncionarioDepartamento;

public interface HistoricoService {
    
    List<FuncionarioDepartamento> findByFuncionarioId(String id);

}
