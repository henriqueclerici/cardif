package com.luiz.cardif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.Cargo;
import com.luiz.cardif.entity.Funcionario;
import com.luiz.cardif.entity.FuncionarioDepartamento;
import com.luiz.cardif.repository.HistoricoRepository;
import com.luiz.cardif.service.FuncionarioService;
import com.luiz.cardif.service.HistoricoService;

@Service
public class HistoricoServiceImpl implements HistoricoService {
    
    private final HistoricoRepository repository;
    private final NextSequenceService nextSequenceService;
    
    
    @Autowired
    public HistoricoServiceImpl (final HistoricoRepository repository, final NextSequenceService nextSequenceService) {
        this.repository = repository; 
        this.nextSequenceService = nextSequenceService;
        
    }

    @Override
    public List<FuncionarioDepartamento> findByFuncionarioName(Funcionario funcionario) {
        return repository.findByFuncionario(funcionario);
    }

    @Override
    public FuncionarioDepartamento createOrUpdate(FuncionarioDepartamento funcionarioDepartamento) {
        funcionarioDepartamento.setFuncionarioDepartamentoId(String.valueOf(nextSequenceService.generateSequence(Cargo.SEQUENCE_NAME)));
        return repository.save(funcionarioDepartamento);
    }

}
