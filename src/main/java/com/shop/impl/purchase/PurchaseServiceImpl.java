package com.shop.impl.purchase;

import com.shop.entity.purchase.Purchase;
import com.shop.repository.PurchaseRepository;
import com.shop.service.purchase.PurchaseService;

import java.util.Optional;

public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public void addPurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    @Override
    public Optional<Purchase> getPurchase(Integer tranNo) {
        return purchaseRepository.findById(tranNo);
    }

    @Override
    public void updatePurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    @Override
    public void updateStatus(String purchaseId, String status) {
        purchaseRepository.updateStatus(purchaseId, status);
    }
}
