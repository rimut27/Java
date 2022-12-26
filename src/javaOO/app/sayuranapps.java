package javaOO.app;

import javaOO.data.*;

public class sayuranapps {
    public static void main(String[] args) {
        sayuran A = new wortel();
        A.namasayuran();
        A.nama();
        System.out.println("nama petani "+A.nama());
        System.out.println("jumlah "+A.jumlah()+" KG");
        if (A.jumlah() <=20 ){
            System.out.println("angkut menggunakan motor");
        }else if (A.jumlah() <40){
            System.out.println("angkut menggunakan mobil");
        }else if (A.jumlah() > 40){
            System.out.println("angkut menggunakan truk");
        }else {
            System.out.println("Nganggur");
        }

        if (A.segar()== true){
            System.out.println("segar");
        }else {
            System.out.println("Piceun we");
        }
    }
}
