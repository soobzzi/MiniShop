package com.shop.service.product;

import com.shop.entity.product.Product;

import java.util.Optional;

public interface ProductService {

    public void addProduct(Product product);

    public Optional<Product> getProduct(Integer prodNo);

    public void updateProduct(Product product);

}
