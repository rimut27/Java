package javaOO.data;

public class farm {
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public class sayuran {
        String nama;

        public String getfarm(){
            return farm.this.nama;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }
}
