package javaOO.app;
import javaOO.data.databseerror;

public class database {
    public static void main(String[] args) {
            data("RR","RM");
        System.out.println("sukses");
    }
    public static void data(String nama,String password){
        if (nama  == null && password == null || nama.isBlank() && password.isBlank() ){
            throw new databseerror("data error");
        }
        System.out.println("hallo "+nama);
    }
}
