package com.shop.impl.product;

import com.shop.entity.product.Product;
import com.shop.repository.ProductRepository;
import com.shop.service.product.ProductService;

import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Optional<Product> getProduct(Integer prodNo) {
        return productRepository.findById(prodNo);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);

    }
}
