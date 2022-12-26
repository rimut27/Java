package javaOO.app;

import javaOO.data.pemilik;
import  javaOO.data.HEWAN;

public class hewanaaps {
    public static void main(String[] args) {
        pemilik pemilik1 = new pemilik();
        pemilik pemilik2 = new pemilik();
        pemilik pemilik3 = new pemilik();

        pemilik1.setNama("mpus");
        pemilik1.setHEWAN(HEWAN.kucing);

        pemilik2.setNama("Donald");
        pemilik2.setHEWAN(HEWAN.ayam);

        pemilik3.setNama("dog");
        pemilik3.setHEWAN(HEWAN.anjing);

        System.out.println(pemilik1.getNama());
        System.out.println(pemilik1.getHEWAN());
        System.out.println(pemilik1.getHEWAN().getDescript());
        System.out.println(pemilik2.getNama());
        System.out.println(pemilik2.getHEWAN());
        System.out.println(pemilik2.getHEWAN().getDescript());
        System.out.println(pemilik3.getNama());
        System.out.println(pemilik3.getHEWAN());
        System.out.println(pemilik3.getHEWAN().getDescript());

        String nbana = HEWAN.anjing.name();
        System.out.println(nbana);

        HEWAN nxana = HEWAN.valueOf("kucing");
        System.out.println(nxana);

        System.out.println("Daftar");
        for (var daftar :HEWAN.values()) {
            System.out.println(daftar);
        }


    }
}
