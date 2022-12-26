public class kepdes {
    String name,position;

    kepdes(String nama,String jabatan){
        this.name = nama;
        this.position = jabatan;
    }
    void katakan(){
        System.out.println("Nama saya " + this.name + " Jabatan saya " + this.position );
    }
}
