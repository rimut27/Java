public class parrentapps {
    public static void main(String[] args) {
       anak anak1 = new anak();
       anak1.nama = "Kikin";
       anak1.doif();
        System.out.println(anak1.nama);

        ortu ortu1 = anak1;
        ortu1.doif();
        ortu1.nama = "Dedeh";
        System.out.println(ortu1.nama );
    }
}