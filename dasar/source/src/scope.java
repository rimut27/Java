public class scope {
	public static void main(String[] args) {
		sayhello("Riyadi");

	}
	static void sayhello(String nama){
		String helo ="Hallo "+nama;
		if(!nama.isBlank());{
			String hi = "Hi "+nama;
			System.out.println(hi);
		}
	}
}
