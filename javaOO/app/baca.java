package javaOO.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class baca {
    public static void main(String[] args) {
        try (BufferedReader baca = new BufferedReader(new FileReader("maca.txt"))) {
            while (true){
               String Tulisan = baca.readLine();
                if (Tulisan == null){
                    break;
                }
                System.out.println(Tulisan);
            }
        } catch (IOException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
