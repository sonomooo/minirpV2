package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Warehouse {

    @Id
    int id;

    String code;
    String name;
    String address;
    String Warehousecol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWarehousecol() {
        return Warehousecol;
    }

    public void setWarehousecol(String warehousecol) {
        Warehousecol = warehousecol;
    }
}
