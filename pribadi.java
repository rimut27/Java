public class pribadi {

    String nama,Nik;
    int umur;
    pribadi (String name,String Nik, int umur){
        this.nama = name;
        this.Nik = Nik;
        this.umur = umur;
    }
    pribadi (String paraname,String no_induk){
     this(paraname,no_induk,0);
    }
    pribadi (String paraname){
        this(paraname,null,0);
     }
    void sayHelo(String  ngaran){
        System.out.println("Halo "+ ngaran+" , My name is "+nama+" NIK "+Nik+" umur saya "+umur);
    }
}
