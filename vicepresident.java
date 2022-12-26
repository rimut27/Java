class vicepresident extends manager {
    vicepresident(String nama , String company){

        super(nama,company);

    }
    void say(String nama){
        System.out.println("Hi, "+nama+", my name is VP "+this.nama+" Bekerja di "+this.usaha);
    }
}
