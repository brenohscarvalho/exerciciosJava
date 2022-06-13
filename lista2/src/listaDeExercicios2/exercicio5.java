package listaDeExercicios2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		int val1=0, val2=1,val3,L,n=3;

		System.out.println("Digite o valor para a sequencia de Fibonacci: ");
		L = ent.nextInt();

		System.out.println(""+val1);
		System.out.println(""+val2);
		// Após a entrada de L, dentro do while, primeiro se considera que valor 1 = 0 e valor 2 = 1(Prescristas como na formula de Fibonacci.
		while (n<L) {
			val3=val1+val2;
			System.out.println(""+val3);
			/* Depois os valores 1 e 2 são "passados para frente" da sequencia apresentando que agora as variaveis valores 
			irão sempre ser somadas de acordo com os valores anteriores ja citados e salvos até o limite "n"*/
			val1=val2;
			val2=val3;
			n++;
		}


	}

}
