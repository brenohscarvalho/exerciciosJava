package lista6;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String frase;
		
		System.out.println("Digite a palavra a ser identificada como palindromo: ");
		frase = ent.nextLine().trim();
		
		
		StringBuilder fraseprint = new StringBuilder(frase);
		//reverse para inverter a frase digitada 
		fraseprint.reverse();
		//criei mais 2 stringBuilder para serem preenchidas sem os espaço 
		StringBuilder invert = new StringBuilder();
		StringBuilder invert2 = new StringBuilder();

		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)!=' ') {
				invert.append(frase.charAt(i));
				invert2.append(frase.charAt(i));
			}
		}
		
		invert.reverse();
		
		String fras1 = invert.toString();
		String fras2 = invert2.toString();
		
		System.out.println(fraseprint);
		//para serem verificadas tive que invertelas para string e utilizar o equals para comparar as duas exatamente

		if (fras1.equals(fras2)){
			System.out.println("A frase é um palindromo");
		}
		else {
			System.out.println("A frase nao é um palindromo");
		}

	}
}
