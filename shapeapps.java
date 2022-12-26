public class shapeapps {
    public static void main(String[] args) {
    var shap = new  shape();
    var rec = new rectangle();
        System.out.println(shap.getcorner());
        System.out.println(rec.getcorner());
        System.out.println(rec.getparencorner());
    }
}

class shape {
    int getcorner(){
        return 0;
    }
}
class rectangle extends  shape{
    int getcorner(){
        return 4;
    }
    int getparencorner(){
        return super.getcorner();
    }
}