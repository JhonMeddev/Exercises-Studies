/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 1114      ║
╚════════════════════╝
*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int lersenha = 0, senha = 2002;
				
		
		while (lersenha != senha) {
			lersenha = sc.nextInt();
			if (lersenha == senha){
				System.out.println("Acesso Permitido");
			}
			else {
				System.out.println("Senha Invalida");
			}
		}

		sc.close();
	}
}