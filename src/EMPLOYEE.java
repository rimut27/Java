 class EMPLOYEE {
    String nama,usaha;

     EMPLOYEE(String nama,String company) {
        this.nama = nama;
        this.usaha = company;
     }
     void say(String nama){
         System.out.println("Hi, "+nama+", my name is employee "+this.nama+" Bekerja di "+this.usaha);
     }
 }
