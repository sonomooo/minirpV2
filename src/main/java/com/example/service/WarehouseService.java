package com.example.service;

import com.example.entity.Warehouse;
import com.example.repository.WarehouseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class WarehouseService {

    WarehouseRepository warehouseRepository;

    @Transactional
    public Object create(Warehouse product){

        return warehouseRepository.save(product);
    }

    public Object read(Warehouse product){

        return warehouseRepository.findById(product);

    }

    public Warehouse update(Long id, String name) throws Throwable {

        Warehouse updateProduct = warehouseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));

        updateProduct.setName(name);

        return updateProduct;
    }

    public String delete(Warehouse warehouse){

        warehouseRepository.deleteById(warehouse);

        return warehouse.getName();


    }
}
