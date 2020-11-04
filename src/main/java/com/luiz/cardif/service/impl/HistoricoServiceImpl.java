package com.luiz.cardif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.FuncionarioDepartamento;
import com.luiz.cardif.repository.HistoricoRepository;
import com.luiz.cardif.service.HistoricoService;

@Service
public class HistoricoServiceImpl implements HistoricoService {
    
    private HistoricoRepository repository;
    
    @Autowired
    public HistoricoServiceImpl (HistoricoRepository repository) {
        this.repository = repository; 
    }

    @Override
    public List<FuncionarioDepartamento> findByFuncionarioId(String id) {
        return repository.findByFuncionarioId(id);
    }

}
