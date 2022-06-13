package lista3;

import java.util.Scanner;

public class exercicio6 {
	public static double fat (int N) {
		Scanner ent = new Scanner(System.in);

		double conta=1,S = 1, valor =1, fat = 1,fat2= 0;
		//calculo de fatorial com while
		while(conta<=N){

			fat *= conta;
			fat2 =fat;


			S += 1/fat2;
			conta++;

		}
		return(S);
	}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		
		System.out.println("Digite o valor de N:");
		n = ent.nextInt();
		
		System.out.println("O resultado é: "+fat(n));
		

	}

}