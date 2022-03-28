public class MethodOverloasd {
	public static void main(String[] args) {
	sayHello();
	sayHello("Riyadi");
	sayHello("Riyadi", "Muttaqin");
	}
	static void sayHello(){
		System.out.println("Hallo");
	}static void sayHello(String firstName){
		System.out.println("Hallo "+firstName);
	}static void sayHello(String firstName, String lastName){
		System.out.println("Hallo "+firstName+" "+lastName);
	}

}
