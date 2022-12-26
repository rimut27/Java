package javaOO.app;

import javaOO.data.farm;

public class farmapps {
    public static void main(String[] args) {
        farm petani = new farm();
        petani.setNama("kakao");

        farm.sayuran sayur1= petani.new sayuran();
        sayur1.setNama("wortel");

        System.out.println(sayur1.getNama());
        System.out.println(petani.getNama());

    }
}
