package javaOO.app;

import javaOO.data.kevalidan;
import javaOO.data.masuk;
import javaOO.data.validasi;

public class validasiapps {
    public static void main(String[] args) {
        masuk orang1 = new masuk("Riyadi ", "secret");

        try {
            kevalidan.validan(orang1);
            System.out.println("login sukases");

        } catch (validasi e) {
            System.out.println("login gagaal " +e.getMessage());
        }finally {
            System.out.println("kembali");
        }
        masuk orang2 = new masuk("Muttaqin", "secret");
        kevalidan.validanruntime(orang2);

    }
}
