public class polysism {
    public static void main(String[] args) {
        EMPLOYEE employee1 = new EMPLOYEE("Riyadi","Unpas");
            employee1.say("Maul");

            employee1 = new manager("Bambang","ITB");
            employee1.say("Erik");

            employee1 = new vicepresident("Ari","Unpad");
            employee1.say("Bagus");

            sayhai(new EMPLOYEE("Bambang","Amik"));
            sayhai(new manager("Bagas","Isbi"));
            sayhai(new vicepresident("Rudi","UIN"));

    }
    static void sayhai(EMPLOYEE employee){
        if (employee instanceof  vicepresident){
            vicepresident vicepresident = (vicepresident) employee;
            System.out.println("Halo VP "+ vicepresident.nama);
        }else if (employee instanceof manager){
            manager manager = (manager) employee;
            System.out.println("Halo manager "+manager.nama);
        }else {
            System.out.println("Halo employee "+employee.nama);
        }
    }
}
