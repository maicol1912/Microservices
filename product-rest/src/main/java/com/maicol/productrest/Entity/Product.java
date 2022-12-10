package com.maicol.productrest.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;

    @Column(name = "UNIT_PRICE")
    private Double unitPrice;

}
