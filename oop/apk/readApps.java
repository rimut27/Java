package oop.apk;

import java.io.BufferedReader;
import java.io.FileReader;

public class readApps {
    public static <throwable> void main(String[] args) {
        try(BufferedReader baca = new BufferedReader( new FileReader("Readme.md"))) {

             while (true){
                String  tulisan = baca.readLine();
                if (tulisan == null){
                    break;
                }
            System.out.println(tulisan);
        }
    }catch (Throwable throwable ){
            System.out.println("file Error "+ throwable.getMessage());
        }
    }
}
