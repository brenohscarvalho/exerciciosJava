package lista6;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String frase;
		char carac;
		System.out.println("Digite uma frase para ser criptografada: ");
		frase = ent.nextLine().trim();
		frase = frase.toUpperCase();
		StringBuilder aaaa = new StringBuilder(frase);
		//utilizei a logica da questão anterior só que somando 3 posições
		for(int i=0; i<frase.length();i++) {
			if (frase.charAt(i)>=65&&frase.charAt(i)<=87) {
				carac = frase.charAt(i);
				carac+=3;
				aaaa.setCharAt(i, carac);
			}
			//alem de fazer uma situação para as 3 ultimas lentras, pois elas nao entram no calculo +3
			else if (frase.charAt(i)==88){
				//88=x
				aaaa.setCharAt(i,'A');
			}
			else if (frase.charAt(i)==89){
				//89=y
				aaaa.setCharAt(i,'B');
			}
			else if (frase.charAt(i)==90){
				//90=z
				aaaa.setCharAt(i,'C');
			}
		}
		System.out.println(aaaa);
	}
}




