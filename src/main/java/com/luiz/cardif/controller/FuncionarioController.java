package com.luiz.cardif.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.cardif.entity.Departamento;
import com.luiz.cardif.entity.Funcionario;
import com.luiz.cardif.service.FuncionarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Funcionario")
public class FuncionarioController {
    
    private final FuncionarioService funcionarioService;
    
    @Autowired
    public FuncionarioController(final FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;        
    }
    
    
    @ApiOperation(value = "Salva funcionarios")    
    @PostMapping(value = "/funcionario")
    public Funcionario createOrUpdate(@RequestBody Funcionario funcionario) {
        return funcionarioService.createOrUpdate(funcionario);
    }
    @ApiOperation(value = "Deleta todos os funcionarios")
    @DeleteMapping(value = "/funcionario")
    public void deleteFuncionario() {
        funcionarioService.delete();
    }
    @ApiOperation(value = "Busca funcionario")
    @GetMapping(value = "/funcionario/{id}")
    public Optional<Funcionario> getFuncionarioId(@PathVariable String id) {
        return funcionarioService.findById(id);
    }
    
    @ApiOperation(value = "Alterar departamento do funcionario")
    @PutMapping(value = "/funcionario/{id}")
    public Funcionario updateFuncionario(@PathVariable String id,  @RequestBody Departamento departamento) {
        return funcionarioService.updateFuncionario(id, departamento);
    }

}
