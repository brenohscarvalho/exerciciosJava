package lista6;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner ent  = new Scanner(System.in);
		StringBuilder palavra = new StringBuilder();
		String frase;
		System.out.println("Digite uma frase: ");
		frase = ent.nextLine().trim();

		
		//repetição até o final da frase
		for(int i = 0;i<frase.length();i++) {
			//se a frase digitada for diferente de espaço acrescentar o caractere
			
			if(frase.charAt(i)!=' ') {
				palavra.append(frase.charAt(i));
			}
		//se for igual a epaço e a proxima posição for diferente de espaço eu acrecento o espaço   
			if(frase.charAt(i)==' ' && frase.charAt(i+1)!=' ') {
				palavra.append(' ');
			}//assim realocando todas em apenas um espaço de diferença
		}
		System.out.println(palavra);
	}
}
