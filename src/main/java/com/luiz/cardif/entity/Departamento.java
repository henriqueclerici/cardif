package com.luiz.cardif.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Departamento {
    
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
