package javaOO.app;

import javaOO.data.dadah;

public class dadahapps {
    static dadah orang1 = new dadah() {
        @Override
        public void saydah() {
            System.out.println("dadah ");
        }

        @Override
        public void saydaha(String nama) {
            System.out.println("Good Bye "+nama);
        }
    } ;

    public static void main(String[] args) {
        orang1.saydah();
        orang1.saydaha("Riyadi ");
    }
}
