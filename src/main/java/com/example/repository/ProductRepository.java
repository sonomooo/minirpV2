package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository {

    Optional<Product> findById(Long id);
    Product save(Product entity);
    void deleteById(Long id);

}
