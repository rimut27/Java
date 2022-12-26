class manager extends EMPLOYEE {


    public manager(String nama, String company) {
        super(nama,company);
    }


    void say(String nama){
        System.out.println("Hi, "+nama+", my name is Manager "+this.nama+" Bekerja di "+this.usaha);
    }
}
