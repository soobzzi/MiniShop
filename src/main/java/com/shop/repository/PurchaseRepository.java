package com.shop.repository;

import com.shop.entity.purchase.Purchase;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

public interface PurchaseRepository extends JpaAttributeConverter<Purchase, Integer> {

    Purchase findByUser_userId(String userId);
}
