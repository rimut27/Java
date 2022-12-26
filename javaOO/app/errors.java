package javaOO.app;

public class errors {
    public static void main(String[] args) throws Throwable {
        try {
            String[] ngaran = {
                    "1","2","3","4"
            };
            System.out.println(ngaran[22]);
        } catch (Throwable e){
            throw new Throwable(e);
        }
    }
}
