package com.luiz.cardif.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Funcionario {
    
    @Id
    String funcionarioId;
    
    String funcionarioName;
    
    String funcionarioAge;
    
    String funcionarioBirthday;
    
    String funcionarioDocument;
    
    @DBRef(lazy = true)
    Cargo cargo;
    
    @DBRef(lazy = true)
    Departamento departamento;

    public String getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(String funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getFuncionarioName() {
        return funcionarioName;
    }

    public void setFuncionarioName(String funcionarioName) {
        this.funcionarioName = funcionarioName;
    }

    public String getFuncionarioAge() {
        return funcionarioAge;
    }

    public void setFuncionarioAge(String funcionarioAge) {
        this.funcionarioAge = funcionarioAge;
    }

    public String getFuncionarioBirthday() {
        return funcionarioBirthday;
    }

    public void setFuncionarioBirthday(String funcionarioBirthday) {
        this.funcionarioBirthday = funcionarioBirthday;
    }

    public String getFuncionarioDocument() {
        return funcionarioDocument;
    }

    public void setFuncionarioDocument(String funcionarioDocument) {
        this.funcionarioDocument = funcionarioDocument;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    

    
}
