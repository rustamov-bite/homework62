package com.example.trader.repositories;

import com.example.trader.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, String> {
    List<Product> findAll();
}
