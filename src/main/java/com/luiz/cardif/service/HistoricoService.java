package com.luiz.cardif.service;

import java.util.List;

import com.luiz.cardif.entity.Funcionario;
import com.luiz.cardif.entity.FuncionarioDepartamento;

public interface HistoricoService {
    
    List<FuncionarioDepartamento> findByFuncionarioName(Funcionario funcionario);
    
    FuncionarioDepartamento createOrUpdate(FuncionarioDepartamento funcionarioDepartamento);
    
    

}
