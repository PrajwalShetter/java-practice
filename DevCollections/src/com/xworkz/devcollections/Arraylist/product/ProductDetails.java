package com.xworkz.devcollections.Arraylist.product;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProductDetails {

    private int productId;
    private String name;
    private double cost;
    private Category category;
    private Size size;
    private boolean isAvailable;


}
