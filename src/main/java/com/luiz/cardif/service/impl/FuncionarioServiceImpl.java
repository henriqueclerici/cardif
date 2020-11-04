package com.luiz.cardif.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.Funcionario;
import com.luiz.cardif.repository.FuncionarioRepository;
import com.luiz.cardif.service.FuncionarioService;


@Service
public class FuncionarioServiceImpl implements FuncionarioService {
    
    private FuncionarioRepository repository;
    
    @Autowired
    public FuncionarioServiceImpl(FuncionarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Funcionario createOrUpdate(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    @Override
    public Optional<Funcionario> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
        
    }

}
