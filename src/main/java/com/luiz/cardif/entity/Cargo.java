package com.luiz.cardif.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cargo {
    
    @Id
    String cargoId;
    String cargoName;
    
    
    public String getCargoId() {
        return cargoId;
    }
    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }
    public String getCargoName() {
        return cargoName;
    }
    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }
    
    
    
    

}
