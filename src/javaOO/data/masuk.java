package javaOO.data;

public record masuk(String nama , String passward) {
    public masuk {
        System.out.println("mengecek apakah valid atau tidak");
        System.out.println();
        System.out.println("Hallo "+nama);
    }
}
