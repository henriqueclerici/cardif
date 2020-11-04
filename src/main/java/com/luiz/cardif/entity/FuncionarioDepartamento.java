package com.luiz.cardif.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FuncionarioDepartamento {

    @Id
    String funcionarioDepartamentoId;

    @DBRef(lazy = true)
    String departamentoId;

    @DBRef(lazy = true)
    String funcionarioId;

    public String getFuncionarioDepartamentoId() {
        return funcionarioDepartamentoId;
    }

    public void setFuncionarioDepartamentoId(String funcionarioDepartamentoId) {
        this.funcionarioDepartamentoId = funcionarioDepartamentoId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(String funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
    
    
    

}
