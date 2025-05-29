package com.example.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StockId implements Serializable {


    String product_id;
    String warehouse_id;

    public StockId(String product_id, String warehouse_id) {
        this.product_id = product_id;
        this.warehouse_id = warehouse_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StockId stockId = (StockId) o;
        return Objects.equals(product_id, stockId.product_id) && Objects.equals(warehouse_id, stockId.warehouse_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, warehouse_id);
    }


}
