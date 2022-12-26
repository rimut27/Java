class person {
String name,Address ;
final String country = "Japan";

    person (String name, String adrrees){
        this.name  = name;
        this.Address = adrrees  ;
    }
    person (String paranma){
        this (paranma,null);
    }
    person (){
        this(null);
    }

void say(String name){
    System.out.println("Halo "+name+", my name is "+this.name+" my address is "+this.Address+" "+country+" Nice meet you");
}
}
