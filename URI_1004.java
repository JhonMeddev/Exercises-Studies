/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 1004      ║
╚════════════════════╝
*/
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println("PROD = " + (A*B));
		
		sc.close();
	}
}