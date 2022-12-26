package oop.data;
import oop.data.login;
import oop.data.validationexcep;
public class validationutil {
    public static void validate(login login) throws validationexcep {
        if (login.nama() == null) {
            throw new validationexcep("usernama tidak boleh null");
        } else if (login.nama().isBlank()) {
            throw new validationexcep("username tidak boleh kosong");
        } else if (login.password() == null) {
            throw new validationexcep("password tidak boleh null");
        } else if (login.password().isBlank()) {
            throw new validationexcep("password tidak boleh kosong");
        }
    }

    public static void validateruntime(login login) {
        if (login.nama() == null) {
            throw new validateRuntime("usernama tidak boleh null");
        } else if (login.nama().isBlank()) {
            throw new NumberFormatException("username tidak boleh kosong");
        } else if (login.password() == null) {
            throw new validateRuntime("password tidak boleh null");
        } else if (login.password().isBlank()) {
            throw new NumberFormatException("password tidak boleh kosong");
        }
    }
}