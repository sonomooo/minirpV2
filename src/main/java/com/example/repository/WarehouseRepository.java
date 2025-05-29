package com.example.repository;

import com.example.entity.Warehouse;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends JpaRepository {

    Warehouse save(Object entity);

    Optional<Warehouse> findById(Object o);

    void deleteById(Object o);

}
