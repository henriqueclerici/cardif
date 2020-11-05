package com.luiz.cardif.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document
public class Departamento {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    
    @JsonIgnore
    @Id
    String departamentoId;
    
    String departamentoName;

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getDepartamentoName() {
        return departamentoName;
    }

    public void setDepartamentoName(String departamentoName) {
        this.departamentoName = departamentoName;
    }
    
    

}
