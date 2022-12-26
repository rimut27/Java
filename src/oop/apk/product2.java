package oop.apk;

import oop.data.*;

public class product2 {
    public static void main(String[] args) {
        product product2 = new product("lenovo", 4000000);
        System.out.println(product2.name);
        System.out.println(product2.price);
        data data1 = new data();

        product product1 = new product("lenovo", 4000000);
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() == product2.hashCode());

    }
}
