package oop.apk;

import oop.data.dataerror;

public class databaseapps {
    public static void main(String[] args) {
        database("eko","eko");
        System.out.println("sukses");

    }
   public static void database(String name, String password){
       if (name == null && password == null || name.isBlank() && password.isBlank()){
           throw new dataerror(" data error");

       }
   }

}
