package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    ProductRepository productRepository;

    @Transactional
    public Object create(Product product){

        return productRepository.save(product);
    }

    public Object read(Product product){

        return productRepository.findById(product);

    }

    public Product update(Long id, String name) throws Throwable {

        Product updateProduct = productRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));

        updateProduct.setName(name);

        return updateProduct;
    }

    public Product delete(Product product){

      productRepository.deleteById(product);

      return product;
    }
}
