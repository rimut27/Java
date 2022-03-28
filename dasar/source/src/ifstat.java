public class ifstat {
	public static void main(String[] args) {
		int a = 80, b = 75;
		float c =( a + b ) / 2;
		System.out.println(c);

		if (c >= 90){
			System.out.println("nilai anda sempurna");
		}else if (c >= 75){
			System.out.println("nilai anda b ");
		}else if (c >= 60){
			System.out.println("nilai anda c");
		}else {
			System.out.println("Silahkan keluar ");
		}

	}
}
