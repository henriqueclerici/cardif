package com.luiz.cardif.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.cardif.entity.Cargo;
import com.luiz.cardif.service.CargoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Cargo")
public class CargoController {
    
    private final CargoService cargoService;
    
    @Autowired
    public CargoController(final CargoService cargoService) {
        this.cargoService = cargoService;
    }
    
    @ApiOperation(value = "Salva cargo dos funcionarios")    
    @PostMapping(value = "/cargo")
    public Cargo createOrUpdate(@RequestBody Cargo cargo) {
        return cargoService.createOrUpdate(cargo);
    }
    @ApiOperation(value = "Deleta cargo pelo id")
    @DeleteMapping(value = "/cargo")
    public void deleteCargo(@PathVariable String id) {
        cargoService.delete(id);
    }
    @ApiOperation(value = "Busca cargo por id")
    @GetMapping(value = "/cargo/{id}")
    public Optional<Cargo> getCargoId(@PathVariable String id) {
        return cargoService.findById(id);
    }
    

}
