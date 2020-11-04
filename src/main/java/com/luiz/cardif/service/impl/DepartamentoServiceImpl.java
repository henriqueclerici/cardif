package com.luiz.cardif.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.Departamento;
import com.luiz.cardif.repository.DepartamentoRepository;
import com.luiz.cardif.service.DepartamentoService;
import java.util.Optional;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
    
    private DepartamentoRepository repository;
    
    @Autowired
    public DepartamentoServiceImpl(DepartamentoRepository repository) {
        this.repository = repository; 
        
    }

    @Override
    public Departamento createOrUpdate(Departamento dapartamento) {
        return repository.save(dapartamento);
    }

    @Override
    public Optional<Departamento> findById(String id) {        
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
        
    }

}
