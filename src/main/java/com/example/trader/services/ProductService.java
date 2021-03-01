package com.example.trader.services;

import com.example.trader.entities.Product;
import com.example.trader.repositories.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public void saveProduct(Product product) {
        productRepo.save(product);
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}
