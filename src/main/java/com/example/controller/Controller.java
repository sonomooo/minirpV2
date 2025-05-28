package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductManagement;

@org.springframework.stereotype.Controller
public class Controller {

    ProductManagement productManagement;

    public Product create(Product product){

        return (Product) productManagement.create(product);
    }

    public Product read(Product product){

        Product readProduct = (Product) productManagement.read(product);

        return product;
    }

    public Product update(Long id, String name) throws Throwable {

        return productManagement.update(id, name);
    }

    public Product delete(Product product){

        return productManagement.delete(product);
    }
}
