package javaOO.data;

public class kategori {
    private String nama;
    private String id ;
    private boolean exp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
       if (nama != null){
           this.nama = nama;
       }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (nama != null) this.id = id;

    }

    public boolean isExp() {
            return exp;
    }

    public void setExp(boolean exp) {
        this.exp = exp;
    }
}
