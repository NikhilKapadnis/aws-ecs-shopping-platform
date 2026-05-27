package com.shopping.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product(1L, "Rice", "Grocery", new BigDecimal("12.99")),
                new Product(2L, "Laptop", "Electronics", new BigDecimal("899.99")),
                new Product(3L, "Detergent", "Household", new BigDecimal("6.49"))
        );
    }

    public record Product(
            Long id,
            String name,
            String category,
            BigDecimal price
    ) {}
}