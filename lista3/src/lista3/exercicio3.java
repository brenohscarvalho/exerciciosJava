package lista3;

import java.util.Scanner;

public class exercicio3 {



	public static void ifOrdem (double n1, double n2, double n3) {
		// os valores são testados em todos os casos e possibilidades com 3 valores 

		if (n1 < n2) {

			if (n3 < n1) {
				System.out.printf("A ordem crescente é: %.0f %.0f %.0f\n",(n3), (n1), (n2));} 
			
			
			else if (n3 < n2) {
				System.out.printf("A ordem crescente é: %.0f %.0f %.0f\n",(n1), (n3), (n2));}
		}
		
		if (n1 > n2) {
			
			if (n2 > n3) {
				System.out.printf("A ordem crescente é: %.0f %.0f %.0f\n",(n3), (n2), (n1));}
			
			
			else if (n3 < n1) {
				System.out.printf("A ordem crescente é: %.0f %.0f %.0f\n",(n2), (n3), (n1));}
		}

		if (n3 > n1) {
			
			if (n1 > n2) {
				System.out.printf("A ordem crescente é: %.0f %.0f %.0f\n",(n2), (n1), (n3));} 
			
			
			else if (n2 < n3) {
				System.out.printf("A ordem crescente é: %.0f %.0f %.0f\n", (n1), (n2), (n3));}
		}
	}

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		double n1=0, n2=0, n3=0,n,inic=1;

		System.out.println("Digite o numero de vezes que será executado: ");
		n = ent.nextDouble();

		while (inic<=n) {
			//while com valores digitados 

			System.out.println("Digite 3 numeros para serem sequenciados;");
			n1 = ent.nextDouble();
			n2 = ent.nextDouble();
			n3 = ent.nextDouble();
			inic++;
			ifOrdem(n1,n2,n3);
		}



	}

}
