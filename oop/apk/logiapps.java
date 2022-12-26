package oop.apk;

import oop.data.login;
import oop.data.validationexcep;
import oop.data.validationutil;

public class logiapps {
    public static void main(String[] args) {
        login login1 = new login("eko","rahasia");

            try {
                validationutil.validate(login1);
            System.out.println("data valid");
        }catch (validationexcep e){
            System.out.println("terjadi  error pada "+e.getMessage());
        }
        login login2 = new login("eko","rahasia");
        validationutil.validateruntime(login2);

    }

}
