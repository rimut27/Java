package javaOO.app;

import javaOO.data.kategori;

public class kategoriapps {
    public static void main(String[] args) {

        var ka = new kategori();

        ka.setId("12323445566");
        ka.setNama("Minyak goreng");
        ka.setExp(false);
        System.out.println(ka.getNama());
        System.out.println(ka.getId());
        System.out.println(ka.isExp());
    }
}
