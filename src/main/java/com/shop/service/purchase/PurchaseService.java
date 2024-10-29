package com.shop.service.purchase;

import com.shop.entity.purchase.Purchase;

import java.util.Optional;

public interface PurchaseService {

    public void addPurchase(Purchase purchase);

    public Optional<Purchase> getPurchase(Integer tranNo);

    public void updatePurchase(Purchase purchase);

    public void updateStatus(String purchaseId, String status);

}
