package com.shop.entity.productImage;

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
@Table(name = "product_image")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductImage {

    @Id
    @Column(name = "image_id")
    private String imageId;

    @Column(name = "image_type")
    private String imageType;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "prod_no")
    private Integer prodNo;

    @Column(name = "uploaded_at")
    private LocalDate uploadedAt;

}
