package oop.apk;

import oop.data.*;
public class carapps {
    static car car1 = new avanza();


    public static void main(String[] args) {
        System.out.println(car1.tire());
        car1.driver();
        System.out.println(car1.getnama());
        System.out.println(car1.isbig());
        System.out.println(car1.ismain());
    }
}
