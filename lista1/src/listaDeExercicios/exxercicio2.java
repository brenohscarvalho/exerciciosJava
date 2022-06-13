package listaDeExercicios;

import java.util.Scanner;

public class exxercicio2 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner (System.in);
		int nota;

		System.out.println("Digite a sua nota ");
		nota = ent.nextInt();

		if (nota>= 8 && nota<=10) {
			System.out.println("Otimo!");

		}
		else if (nota>=7 && nota <8) {
			System.out.println("Bom!");
		}
		else if (nota>=5 && nota <7) {
			System.out.println("Regular");
		}
		else {
			System.out.println("Ruim");
		}
		 ent.close();
	}
}
