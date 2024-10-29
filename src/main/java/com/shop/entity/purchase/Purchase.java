package com.shop.entity.purchase;


import com.shop.entity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "transaction")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Purchase {

    @Id
    @Column(name = "purchase_id")
    private String purchaseId;

    @Column(name = "prod_no")
    private Long prodNo;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "delivery_address")
    private String devyAddr;

    @Column(name = "delivery_date")
    private String devyDate;

    @Column(name = "delivery_request")
    private String devyRequest;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "payment_option")
    private String paymentOption;

    private String quantity;

    private String status;

    @Column(name = "total_price")
    private String totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;


}
