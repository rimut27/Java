
public class aplikasitodilist {
	public static String[] data = new String[10];
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		viewMenampilkanTodo();
	}

	public static void menampilkanTodo() {
		System.out.println("Aplikasi Todo list");
		for (var a = 0; a < data.length; a++) {
			var todo = data[a];
			var no = a + 1;
			if (todo != null) {
				System.out.println(no + ". " + todo);
			}
		}
	}

	public static void testmenampilkanTodo() {
		data[0] = "makan";
		data[1] = "minum";
		menampilkanTodo();
	}

	public static void menambahTodo(String todo) {
		//cek kesediaan
		var full = true;
		for (int a = 0; a < data.length; a++) {
			if (data[a] == null) {
				full = false;
				break;
			}
		}

		if (full) {
			var temp = data;
			data = new String[data.length * 2];

			for (int a = 0; a < temp.length; a++) {
				data[a] = temp[a];
			}

		}
		for (int a = 0; a < data.length; a++) {
			if (data[a] == null) {
				data[a] = todo;
				break;
			}
		}
	}

	public static void testmenambahTodo() {
		for (int a = 0; a <= 30; a++) {
			menambahTodo("data ke- " + a);
		}
		menampilkanTodo();
	}

	//hapus
	public static boolean hapusTodo(Integer number) {
		if ((number - 1) >= data.length) {
			return false;
		} else if (data[number - 1] == null) {
			return false;
		} else {
			for (int i = (number - 1); i < data.length; i++) {
				if (i == (data.length - 1)) {
					data[i] = null;
				} else {
					data[i] = data[i + 1];
				}
			}
			return true;
		}
	}


	public static void testhapusTodo() {
		menambahTodo("satu");
		menambahTodo("dua");
		menambahTodo("tiga");
		menambahTodo("empat");
		menambahTodo("liam");

		var result = hapusTodo(1);

		System.out.println(result);
		menampilkanTodo();
	}

	public static String masukan(String info) {
		System.out.println(info + " : ");
		String data = scanner.nextLine();
		return data;
	}

	public static void inputtest() {
		var nama = masukan("Nama");
		System.out.println("Hi" + nama);
	}

	//menampilkan todo
	public static void viewMenampilkanTodo() {
		while (true) {
			menampilkanTodo();

			System.out.println("menu");
			System.out.println("1. Tambah");
			System.out.println("2. Hapus");
			System.out.println("3. Keluar");

			var input = masukan("pilih");

			if (input.equals("1")) {
				viewmenambahTodo();
			} else if (input.equals("2")) {
				viewhapusTodo();
			} else if (input.equals("3")) {
				System.out.println("Terimakasi sudah mengggunkan aplikasi kami");
				break;
			} else {
				System.out.println("maaf permintaan tidak bisa diproses");
				break;
			}
		}
	}

	public static void tesviewshow() {
		menambahTodo("satu");
		menambahTodo("dua");
		menambahTodo("tiga");
		menambahTodo("empat");
		menambahTodo("liam");
		viewMenampilkanTodo();

	}

	public static void viewmenambahTodo() {
		System.out.println("MENAMBAH TODOLIST");

		var masuk = masukan("tekan x untuk membatalkan ");

		if (masuk.equals("x")) {
			System.out.println("Anda telah membatalkan");
			viewMenampilkanTodo();
		} else {
			menambahTodo(masuk);
		}
	}

	public static void testviewmenambahTodo() {
		menambahTodo("limo");
		menambahTodo("enom");

		viewmenambahTodo();

		menampilkanTodo();
	}

	public static void viewhapusTodo() {
		System.out.println("MENGHAPUS TODO ");

		var no = masukan("Pilih number yang akan di hapus (x untuk membatalkan)");

		if (no.equals("x")) {
			System.out.println("Anda telahh membatalkan untuk meanghapus todo");
		} else {
			boolean success = hapusTodo(Integer.valueOf(no));
			if (!success) {
				System.out.println("gagal mengahapus todo " + no);
			}

		}
	}
	public static void tesviewhapusTodo(){
		menambahTodo("satu");
		menambahTodo("dua");
		menambahTodo("tiga");
		menambahTodo("empat");
		menambahTodo("liam");
		menampilkanTodo();
		viewhapusTodo();
		menampilkanTodo();
	}
}