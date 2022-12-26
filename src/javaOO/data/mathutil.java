package javaOO.data;

public class mathutil {
    public static final int sum (int... values){
        int total = 0;
        for (var value : values){
            total =+ value;
        }
        return total;
    }
}
