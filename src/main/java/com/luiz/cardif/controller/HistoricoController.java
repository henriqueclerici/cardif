package com.luiz.cardif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.cardif.entity.FuncionarioDepartamento;
import com.luiz.cardif.service.FuncionarioService;
import com.luiz.cardif.service.HistoricoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Historico")
public class HistoricoController {
    
    private final HistoricoService historicoService;
    private final FuncionarioService funcionarioService;
    
    @Autowired
    public HistoricoController(final HistoricoService historicoService, final FuncionarioService funcionarioService) {
        this.historicoService = historicoService;
        this.funcionarioService = funcionarioService;
    }
    
    
    @ApiOperation(value = "Retorna a lista de historico de departamentos do funcionario")
    @GetMapping(value = "/historico/{name}")
    public List<FuncionarioDepartamento> findHistorico(@PathVariable String name){
      return historicoService.findByFuncionarioName(funcionarioService.findByFuncionarioName(name));
    }
    
    

}
