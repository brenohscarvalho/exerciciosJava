package lista6;

import java.util.Scanner;

public class questao6 {
	public static void proced(int n, String palavra){
		//foi feito uma recursividade colocando a primeira letra 
		if(n==1){
			System.out.println(palavra.charAt(0));
		}
		else{
			//nesse caso é sempre retornado a posição -1
			proced(n-1,palavra);
			//for para colocar espaços até o limite da string palavras
			for(int i=2;i<=n;i++){
				System.out.print(" ");
			}
			System.out.print(palavra.charAt(n-1));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);

		System.out.print("Digite um palavra: ");
		String palavra = ent.nextLine().trim();

		proced(palavra.length(),palavra);

	}
}


