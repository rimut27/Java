public class MethodVararibelArugument {
	public static void main(String[] args) {
	saycongrats("Riyadi Muttaqin",80,90,70,80);
	saycongrats("Kakang Nurdin",10,20,10,20);
	}
	static void saycongrats (String nama, int ... values){
		int c = 0;
		for (var a : values){
			c += a;
		}
		int d = c / values.length;
		if(d >= 75 ){
			System.out.println("selamat "+nama+" anda lulus");
		}else{
			System.out.println("maaf "+nama+" coba lagi");
		}
	}
}
