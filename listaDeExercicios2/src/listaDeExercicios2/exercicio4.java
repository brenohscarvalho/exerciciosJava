package listaDeExercicios2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		int t1=0, t2=1,t3,cont,L,n=3;

		System.out.println("Digite o valor para a sequencia de Fibonacci: ");
		L = ent.nextInt();

		while (n<=L) {
		t3=t1+t2;
			System.out.println(t3);
			t1=t2;
			t2=t3;
			n++;
		}

	}

}
