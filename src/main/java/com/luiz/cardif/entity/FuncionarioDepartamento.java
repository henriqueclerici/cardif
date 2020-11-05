package com.luiz.cardif.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document
public class FuncionarioDepartamento {
    
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";     

    @JsonIgnore
    @Id
    String funcionarioDepartamentoId;

    @DBRef(lazy = true)
    Departamento departamento;

    @DBRef(lazy = true)
    Funcionario funcionario;

    public String getFuncionarioDepartamentoId() {
        return funcionarioDepartamentoId;
    }

    public void setFuncionarioDepartamentoId(String funcionarioDepartamentoId) {
        this.funcionarioDepartamentoId = funcionarioDepartamentoId;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

  
    
    
    

}
