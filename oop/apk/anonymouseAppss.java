package oop.apk;

import oop.data.anonymous;

public class anonymouseAppss {
    public static void main(String[] args) {

        anonymous oranga = new anonymous() {
            public void sayhello() {
                System.out.printf("Hallo");
            }

            public void sayhello(String nama) {
                System.out.printf("Hello "+nama);
            }
        };

     oranga.sayhello();
     oranga.sayhello("Kikin");
    }
}
