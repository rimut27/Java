package oop.data;

public record login(String nama, String password) {
       public login{
        System.out.println("ini adalah aplikasi login");
        System.out.println();
           System.out.println("Halo "+nama);
    }

}
