public class poly2 {
    public static void main(String[] args) {
        kepdes dessa1 = new kepdes("Lilis","Kepala desa");
        dessa1.katakan();
        dessa1 = new rw("Dede Rochmana","Ketua RW 2");
        dessa1.katakan();
        dessa1 = new rt("Hendrawan","Ketua RT 2");
        dessa1.katakan();

        say(new kepdes ("Joko","pp"));
        say(new rt("koko","kk"));
        say(new rw("kiki","mm"));
    }

    static void say (kepdes kepdes){
        if (kepdes instanceof  rw){
            rw rw = (rw) kepdes;
            System.out.println("Halo Pak RW "+rw.name );
        } else  if (kepdes instanceof rt){
            rt rt = (rt) kepdes;
            System.out.println("Hallo Pak RT "+rt.name);
        }else {
            System.out.println("Hallo Pak/Bu Kepdes "+kepdes.name);
        }
    }
}
