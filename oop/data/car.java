package oop.data;

public interface car extends brand{

    void driver();
    int tire();
    default boolean isbig(){
        return false;
    }

    String getnama();
    boolean ismain() ;
}
