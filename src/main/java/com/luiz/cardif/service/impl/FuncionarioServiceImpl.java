package com.luiz.cardif.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiz.cardif.entity.Cargo;
import com.luiz.cardif.entity.Departamento;
import com.luiz.cardif.entity.Funcionario;
import com.luiz.cardif.entity.FuncionarioDepartamento;
import com.luiz.cardif.repository.FuncionarioRepository;
import com.luiz.cardif.service.CargoService;
import com.luiz.cardif.service.DepartamentoService;
import com.luiz.cardif.service.FuncionarioService;
import com.luiz.cardif.service.HistoricoService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository repository;
    private final NextSequenceService nextSequenceService;
    private final HistoricoService historicoService;
    private final DepartamentoService departamentoService;
    private final CargoService cargoService;

    @Autowired
    public FuncionarioServiceImpl(final FuncionarioRepository repository, final NextSequenceService nextSequenceService,
            final HistoricoService historicoService, final DepartamentoService departamentoService, final CargoService cargoService) {
        this.repository = repository;
        this.nextSequenceService = nextSequenceService;
        this.historicoService = historicoService;
        this.departamentoService = departamentoService;
        this.cargoService = cargoService; 
    }

    @Override
    public Funcionario createOrUpdate(Funcionario funcionario) {
        funcionario.setFuncionarioId(String.valueOf(nextSequenceService.generateSequence(Cargo.SEQUENCE_NAME)));
        funcionario.setDepartamento(departamentoService.findByDepartamentoName(funcionario.getDepartamento().getDepartamentoName()));
        funcionario.setCargo(cargoService.findByCargoName(funcionario.getCargo().getCargoName()));
        Funcionario funcionarioNovo = repository.save(funcionario);
        historicoService.createOrUpdate(popularObjeto(funcionarioNovo));
        return repository.save(funcionario);
    }

    @Override
    public Optional<Funcionario> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete() {
        repository.deleteAll();

    }

    public FuncionarioDepartamento popularObjeto(Funcionario funcionario) {
        FuncionarioDepartamento funcionarioDepartamento = new FuncionarioDepartamento();
        funcionarioDepartamento.setFuncionario(funcionario);
        funcionarioDepartamento.setDepartamento(funcionario.getDepartamento());
        return funcionarioDepartamento;
    }

    @Override
    public Funcionario findByFuncionarioName(String name) {
        return repository.findByFuncionarioNameIgnoreCaseContaining(name);
    }

    @Override
    public Funcionario updateFuncionario(String id, Departamento departamento) {
        Funcionario funcionario = repository.findById(id).get();
        funcionario.setDepartamento(departamentoService.findByDepartamentoName(departamento.getDepartamentoName()));
        historicoService.createOrUpdate(popularObjeto(funcionario));
        return repository.save(funcionario);
    }

}
