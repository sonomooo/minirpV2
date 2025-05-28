package com.example.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends JpaRepository {

    @Override
    Object save(Object entity);

    @Override
    Optional findById(Object o);

    @Override
    void deleteById(Object o);

}
