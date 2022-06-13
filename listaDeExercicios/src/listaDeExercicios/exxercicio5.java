package listaDeExercicios;

import java.util.Scanner;

public class exxercicio5 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner (System.in);
		double n,s, soma,salva=0;


		System.out.println("Digite o valor de N");
		n = ent.nextDouble();

		for (s=1; s<=n ;s++) {
			
			soma=1/s;
			salva+=soma;
			System.out.println("O valor atual é "+salva);
			
		}
		System.out.println("O valor final "+salva);
		
	}
}
