public class MethodReturnValue {

	public static void main(String[] args) {
		System.out.println(sum(123,456));
		System.out.println(hitung(12,"+",21));
		System.out.println(hitung(12,"-",21));
		System.out.println(hitung(12,"/",21));
		System.out.println(hitung(12,"x",21));

	}
	static int sum(int a, int b ){
		int c = a + b;
		System.out.println(c);
		return 0;
	}
	static int hitung(int a, String apa, int b){
		switch (apa){
			case "+" -> {
				return a + b ;
			}
			case "-" -> {
				return a - b ;
			}
			case "x" -> {
				return a * b ;
			}
			case "/" -> {
				return a / b ;
			}
			case  "%"-> {
				return  a % b ;
			}
			default -> {
				return 0;
			}
		}

	}
}
