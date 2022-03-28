public class fcontinue {
	public static void main(String[] args) {
		int c ;
		for ( c=0;c<100 ; c++) {
			if (c %10 == 0){
				continue;
			}
			System.out.println(c);
		}
	}
}
