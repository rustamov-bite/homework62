package com.example.trader.controllers;

import com.example.trader.entities.Product;
import com.example.trader.enums.TypeProduct;
import com.example.trader.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Void> saveProduct() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5) + 2; i++) {
            Product product = Product.builder()
                    .price(random.nextInt(10) + 1)
                    .type(TypeProduct.values()[random.nextInt(TypeProduct.values().length)])
                    .build();
            productService.saveProduct(product);
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/product")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/randomProduct")
    public Product getRandomProduct() {
        Random random = new Random();
        Product product = Product.builder()
                .price(random.nextInt(10) + 1)
                .type(TypeProduct.values()[random.nextInt(TypeProduct.values().length)])
                .build();
        productService.saveProduct(product);
        return product;
    }
}
