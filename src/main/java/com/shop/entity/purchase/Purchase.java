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
    @Column(name = "tran_no")
    private Integer tranNo;

    @Column(name = "prod_no")
    private Long prodNo;

    @Column(name = "buyer_id")
    private String buyerId;

    @Column(name = "demailaddr")
    private String demailaddr;

    @Column(name = "divy_date")
    private String divyDate;

    @Column(name = "divy_request")
    private String divyRequest;

    @Column(name = "order_data")
    private LocalDate orderDate;

    @Column(name = "payment_option")
    private String paymentOption;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_Phone")
    private String receiverPhone;

    @Column(name = "tran_status_code")
    private String tranCode;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;


}
