package oop.data;

public class bus implements car {
    public void driver() {
        System.out.println("Bus driver");
    }

    public int tire() {
        return 0;
    }

    public boolean isbig() {
        return false;
    }
    public String getnama() {
     return "Hino";
    }

    public boolean ismain() {
        return true;
    }
}
