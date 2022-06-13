package lista6;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String cadeia;
		char carac;
		StringBuilder salva = new StringBuilder();
		System.out.println("Digite uma cadeia de caracteres: ");
		cadeia = ent.nextLine();
		//utilizei a tabela ascii como base -32 para imprimir o carac mausculo
		for(int i=0; i<cadeia.length();i++) {
			if (cadeia.charAt(i)>=97&&cadeia.charAt(i)<=122) {
				
				carac = cadeia.charAt(i);
				carac-=32;
				System.out.print(carac);
			}
		}
		
	}

}
