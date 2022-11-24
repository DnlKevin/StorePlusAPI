package com.kataAngular.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kataAngular.api.model.Product;
import com.kataAngular.api.repository.ProductRepository;

import lombok.Data;

@Data
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> getProduct(final Long id) {
        return productRepository.findById(id);
    }

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(final Long id) {
        productRepository.deleteById(id);
    }

    public Product saveEmployee(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

}