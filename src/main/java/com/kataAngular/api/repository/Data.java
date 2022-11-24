package com.kataAngular.api.repository;
import com.kataAngular.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Data implements ApplicationRunner {
    public List products = new ArrayList<Product>();
    private ProductRepository productRepository;

    @Autowired
    public Data (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        products.addAll(Arrays.asList(
                new Product("product1", "product1", "40", ""),
                new Product("product2", "product2", "40", ""),
                new Product("product3", "product3", "40", ""),
                new Product("product4", "product4", "40", "")
        ));
        this.productRepository.saveAll(products);
    }
}