package com.luiz.cardif.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.Cargo;
import com.luiz.cardif.entity.Departamento;
import com.luiz.cardif.repository.DepartamentoRepository;
import com.luiz.cardif.service.DepartamentoService;
import java.util.Optional;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
    
    private final DepartamentoRepository repository;
    private final NextSequenceService nextSequenceService;
    
    @Autowired
    public DepartamentoServiceImpl(final DepartamentoRepository repository, final NextSequenceService nextSequenceService) {
        this.repository = repository; 
        this.nextSequenceService = nextSequenceService;
        
    }

    @Override
    public Departamento createOrUpdate(Departamento dapartamento) {
        dapartamento.setDepartamentoId(String.valueOf(nextSequenceService.generateSequence(Cargo.SEQUENCE_NAME)));
        return repository.save(dapartamento);
    }

    @Override
    public Optional<Departamento> findById(String id) {        
        return repository.findById(id);
    }

    @Override
    public void delete() {
        repository.deleteAll();        
    }

    @Override
    public Departamento findByDepartamentoName(String name) {
        return repository.findByDepartamentoNameIgnoreCaseContaining(name);
    }

}
