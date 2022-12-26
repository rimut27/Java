package oop.apk;

import oop.data.product;

public class productapp {
    public static void main(String[] args) {
        product product1 = new product("Mouse", 60000);
        System.out.println(product1.name);
        System.out.println(product1.price);
        System.out.println(product1);

        product product2 = new product("Mouse", 60000);
        System.out.println(product2.equals(product1));
    }
}
