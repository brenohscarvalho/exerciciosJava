package listaDeExercicios;

import java.util.Scanner;

public class exxercicio3 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner (System.in);
		double diariaN, Pdiaria, diariaP, valor80, valor50, dif;
		
		
		System.out.println("Digite o valor normal da diaria: ");
		diariaN = ent.nextDouble();
		
		Pdiaria = (diariaN*25/100); 
		diariaP = diariaN-Pdiaria;
		System.out.println("Valor promocional é de "+ diariaP);
		
		valor80 = 60*diariaP;
		System.out.println("o valor total arrecadado com 80% de ocupação e diária promocional é: " + valor80);
		valor50 = 38*diariaN;
		System.out.println("o valor total arrecadado com 50% de ocupação e diária normal é " + valor50);
		dif = valor80-valor50;
		System.out.println("A diferença de valores é "+ dif);
		 ent.close();
	}
}
