package lista6;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner ent  = new Scanner(System.in);
		StringBuilder palavra = new StringBuilder();
		String frase;
		System.out.println("Digite uma frase: ");
		frase = ent.nextLine().trim();

		
		//repeti��o at� o final da frase
		for(int i = 0;i<frase.length();i++) {
			//se a frase digitada for diferente de espa�o acrescentar o caractere
			
			if(frase.charAt(i)!=' ') {
				palavra.append(frase.charAt(i));
			}
		//se for igual a epa�o e a proxima posi��o for diferente de espa�o eu acrecento o espa�o   
			if(frase.charAt(i)==' ' && frase.charAt(i+1)!=' ') {
				palavra.append(' ');
			}//assim realocando todas em apenas um espa�o de diferen�a
		}
		System.out.println(palavra);
	}
}
