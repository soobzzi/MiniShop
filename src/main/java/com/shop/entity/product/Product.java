package com.shop.entity.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @Column(name = "prod_no")
    private int prodNo;

    @Column(name = "manufacture_day")
    private String manuDate;

    private int price;

    @Column(name = "prod_detail")
    private String prodDetail;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "reg_date")
    private LocalDate regDate;

    @Column(name = "image_file")
    private String image;

}
