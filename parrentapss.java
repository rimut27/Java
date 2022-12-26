public class parrentapss {
    public static void main(String[] args) {
    var parent1 = new parent();
    parent1.nama = "Oji Suryaji";
    parent1.TempatLahir ="Ciamis";
    parent1.katakan("Hendrawan");
    var anak = new child();
    anak.nama = "Riyadi Muttaqin";
    anak.TempatLahir = "Bandung";
    anak.katakan("Hendrawan");
    var istri = new wife();
    istri.nama = "Dedeh";
    istri.TempatLahir = "Bandung";
    istri.katakan("Hendrawan");

    }
}

class parent {
    String nama,TempatLahir;
    void katakan(String rt){
        System.out.println("Assalamu'aikum bapak "+rt+" sebagai ketua rt");
        System.out.println("nama saya "+nama+" Tempat lahir saya di "+TempatLahir);
    }
}
class  child extends parent{
    void katakan(String rt){
        System.out.println("Assalamu'aikum bapak "+rt+" sebagai ketua rt");
        System.out.println("nama saya "+nama+" saya adalah seorang anak dari yang" +
                " bertempat lahir saya di "+TempatLahir);
    }
}
class wife extends parent {
    void katakan(String rt){
        System.out.println("Assalamu'aikum bapak "+rt+" sebagai ketua rt");
        System.out.println("nama saya "+nama+"ibu rumah" +
                "tangga  Tempat lahir saya di "+TempatLahir);
    }
}