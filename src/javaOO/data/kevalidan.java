package javaOO.data;
import javaOO.data.masuk;
import javaOO.data.validasi;
public class kevalidan {
    public static void validan (masuk masuk) throws validasi {
        if (masuk.nama() == null) {
            throw new validasi("silahkan masukan nama anda ");
        } else if (masuk.nama().isBlank()) {
            throw new validasi("silahkan masukan nama anda ");
        }
        else if (masuk.passward() == null) {
            throw new validasi("silahkan masukan password anda ");
        } else if (masuk.passward().isBlank()) {
            throw new validasi("silahkan masukan password anda ");
        }
    }
    public static void validanruntime (masuk masuk)  {
        if (masuk.nama() == null) {
            throw new validaseisetiapwaktu("silahkan masukan nama anda ");
        } else if (masuk.nama().isBlank()) {
            throw new NullPointerException("silahkan masukan nama anda ");
        }
        else if (masuk.passward() == null) {
            throw new validaseisetiapwaktu("silahkan masukan password anda ");
        } else if (masuk.passward().isBlank()) {
            throw new NullPointerException("silahkan masukan password anda ");
        }
    }
}
