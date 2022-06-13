package listaDeExercicios2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		double N,conta=1,E = 1, valor =1, fat = 1,fat2= 0;

		System.out.println("Digite o valor de N:");
		N = ent.nextInt();
//Utilizei a logica de "salvar" o valor da variavel antes para ser utilizado depois na construçãa da formula do fatorial.
		while(conta<=N){
			
			fat *= conta;
			fat2 =fat;
		// "1=1+1/1!... utilizei da logica da formula apresentado na questão para descobrir em um sistema de repeção o valor de E.	
			E += 1/fat2;
			conta++;

		}System.out.println("O resultado final é:" +E);
	}

}



