/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 1112      ║
╚════════════════════╝
*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int campoX, campoY, precoP, Q, stop=1, schweisen, lixo;
		String pergunta;
		//preço <= 10
		campoX = sc.nextInt();
		campoY = sc.nextInt();
		precoP = sc.nextInt();
		Q = sc.nextInt();
		
		while (stop != 0){
			pergunta = sc.next();
			schweisen = sc.nextInt();
			campoX = sc.nextInt();
			campoY = sc.nextInt();
			
	//		if (AN3.equals("carnivoro")) {
	//			System.out.println("aguia");
	//		}
			
			if (campoX == 0 && campoY == 0 && precoP == 0){
				stop = 0;
			}
			else {
				stop = 1;
				if (pergunta.equals("P")) {
					
				}
			}
		}
		sc.close();
	}
}