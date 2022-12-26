public class bentuk {
    public static void main(String[] args) {

        var katakan = new segi();
        var kata = new segi2();
        System.out.println(katakan.say());
        System.out.println(kata.say());
        System.out.println(kata.saya());
    }
}

class segi{
    String say(){
        return "Halo";
    }
}
class segi2 extends segi{
    String say(){
        return "hai";
    }
    String saya(){
       return super.say();
    }
}