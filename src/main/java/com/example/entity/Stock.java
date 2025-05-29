package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Stock {

    @EmbeddedId
    private StockId id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne //FK 연결
    @MapsId //연관된 값을 가져온다.
    @JoinColumn(name = "warehouse_id") //외래키 컬럼을 명시
    private Warehouse warehouse;

    private int qty_on_hand;

}
