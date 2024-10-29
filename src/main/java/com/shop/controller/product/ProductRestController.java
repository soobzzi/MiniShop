package com.shop.controller.product;

import com.shop.entity.product.Product;
import com.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct(){
        List<Product> productList = productRepository.findAll();

        return ResponseEntity.ok(productList);
    }

}
