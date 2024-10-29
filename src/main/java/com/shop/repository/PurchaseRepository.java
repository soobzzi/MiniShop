package com.shop.repository;

import com.shop.entity.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PurchaseRepository extends JpaRepository<Purchase , Integer> {

    @Modifying
    @Query("UPDATE Purchase SET status = :status WHERE purchasId = :purchaseId")
    public void updateStatus(@Param("purchaseId") String purchaseId , @Param("status") String status);
}
