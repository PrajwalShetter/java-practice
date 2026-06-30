package com.xworkz.devcollections.Arraylist.product;

import java.util.ArrayList;
import java.util.List;

public class ProductRunner {

    public static void main(String[] args) {

        ProductDetails product1= new ProductDetails(01,"T-shirt",1200.00,Category.Cloth,Size.MEDIUM,true);
        ProductDetails product2= new ProductDetails(02,"Arduino ",600.00,Category.Electronics,Size.MEDIUM,true);
        ProductDetails product3= new ProductDetails(03,"Dolo",12.00,Category.Medicine,Size.SMALL,true);
        ProductDetails product4= new ProductDetails(04,"Biryani",120.00,Category.Food,Size.MEDIUM,true);
        ProductDetails product5= new ProductDetails(05,"pipe cleaner",1500.00,Category.Craft,Size.MEDIUM,true);
        ProductDetails product6= new ProductDetails(06,"Dal",80.00,Category.Grocery,Size.SMALL,true);
        ProductDetails product7= new ProductDetails(07,"pant",800.00,Category.Cloth,Size.LARGE,false);
        ProductDetails product8= new ProductDetails(8,"curry",180.00,Category.Food,Size.MEDIUM,true);


        List<ProductDetails> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);

        for (ProductDetails pd : products){
            System.out.println(pd);
        }


    }
}
