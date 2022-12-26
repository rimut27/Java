package oop.apk;

import oop.data.cutumers;
import oop.data.tingkatan;

public class enumapps {
    public static void main(String[] args) {

        cutumers orang1 = new cutumers();

        orang1.setCustumrs("Ejko");
        orang1.setLevel(tingkatan.PRIMIUM);

        cutumers orang2 = new cutumers();

        orang2.setCustumrs("Kurniawan");
        orang2.setLevel(tingkatan.STANDART);

        cutumers orang3 = new cutumers();

        orang2.setCustumrs("Khanedy");
        orang3.setLevel(tingkatan.VIP);

        System.out.println(orang1.getCustumrs());
        System.out.println(orang1.getLevel());
        System.out.println(orang1.getLevel().getDeskreips());

        System.out.println(orang2.getCustumrs());
        System.out.println(orang2.getLevel());
        System.out.println(orang2.getLevel().getDeskreips());

        System.out.println(orang3.getCustumrs());
        System.out.println(orang3.getLevel());
        System.out.println(orang3.getLevel().getDeskreips());

        String leevel = tingkatan.VIP.name();
        System.out.println(leevel);

        tingkatan tingkatana = oop.data.tingkatan.valueOf("STANDART");
        System.out.println(tingkatana);

        for (var value:tingkatan.values() ) {
            System.out.println(value);

        }
    }
}
