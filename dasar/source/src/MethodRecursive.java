public class MethodRecursive {
	public static void main(String[] args) {
		System.out.println(factorial(100));
		System.out.println(factorialrescuve(5));
		ulang(100000);
	}
	static int factorial(int isi) {
		int result = 1;
		for (int i = 1; i <= isi; i++) {
			result *= i ;
		}
		return result;
	}
	static int factorialrescuve (int isi){
		if(isi == 1){
		return 1;
		}else {
			return isi * factorialrescuve(isi -1);
		}
	}
	static void ulang(int isi){
		if(isi == 0){
			System.out.println("selesai");
		}else {
			System.out.println("loop ke-"+isi);
			ulang(isi -1);
		}
	}
}

