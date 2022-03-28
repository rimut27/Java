public class sw {
	public static void main(String[] args) {
		int a = 3;
		System.out.println("1.Jurusan MI/D3 ");
		System.out.println("2.Jurusan TK/D3 ");
		System.out.println("3.Jurusan KA/D3 ");
		System.out.println("4.Jurusan TI/D3 ");
		System.out.println("5.Jurusan SI/D3 ");


		switch (a){
			case 1 -> System.out.println("1.Jurusan MI/D3 ");
			case 2 -> System.out.println("2.Jurusan TK/D3 ");
			case 3 -> System.out.println("3.Jurusan KA/D3 ");
			case 4 -> System.out.println("4.Jurusan TI/D3 ");
			case 5 -> System.out.println("5.Jurusan SI/D3 ");
			default -> System.out.println("tidak ada pilihan");
		}

	}
}
