import java.util.Arrays;

public class foreach {
	public static void main(String[] args) {
		String [][] a = {
				{"Saya","adalah", "Riyadi"},
				{"aku","ini", "Muttaqin"}
		};
		for (var b : a) {
			System.out.println(Arrays.toString(b));
		}
	}
}
