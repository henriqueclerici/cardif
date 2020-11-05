package com.luiz.cardif.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.cardif.entity.Departamento;
import com.luiz.cardif.service.DepartamentoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Departamento")
public class DepartamentoController {
    
    private final DepartamentoService departamentoService;
    
    @Autowired
    public DepartamentoController(final DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }
    
    @ApiOperation(value = "Salva departamento dos funcionarios")    
    @PostMapping(value = "/departamento")
    public Departamento createOrUpdate(@RequestBody Departamento departamento) {
        return departamentoService.createOrUpdate(departamento);
    }
    @ApiOperation(value = "Deleta todos os departamentos")
    @DeleteMapping(value = "/departamento")
    public void deleteDepartamento() {
        departamentoService.delete();
    }
    @ApiOperation(value = "Busca departamento por id")
    @GetMapping(value = "/departamento/{id}")
    public Optional<Departamento> getDepartamentoId(@PathVariable String id) {
        return departamentoService.findById(id);
    }
    
    
    

}
