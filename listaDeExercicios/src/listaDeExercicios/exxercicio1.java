package listaDeExercicios;

import java.util.Scanner;

public class exxercicio1 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner (System.in);
		int num1, num2, r, m5, m7;

		System.out.println("Digite o Valor primeiro valor ");
		num1 = ent.nextInt();
		System.out.println("Digite o Valor segundo valor ");
		num2 = ent.nextInt();

		r= num1 + num2;
		System.out.println("O resultado da soma é "+ r);

		if (r<=10) {
			m5 = r+5;
			System.out.println("+5 é igual a: "+m5);

		}
		else {
			m7= r+7;
			System.out.println("+7 é igual a: "+m7);
		}
		 ent.close();
	}
}
