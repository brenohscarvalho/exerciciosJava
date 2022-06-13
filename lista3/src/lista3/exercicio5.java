package lista3;

import java.util.Scanner;

public class exercicio5 {

	public static void media(double n) {
		//média de notas feitas baseadas nas letras referente a tabela
		if (n <= 39) {
			System.out.println("F");
		}
		else if (n >= 40 && n <= 59 ) {
			System.out.println("E");
		}
		else if (n >= 60 && n <= 69) {
			System.out.println("D");
		}
		else if (n >= 70 && n <= 79) {
			System.out.println("C");
		}
		else if (n >= 80 && n <= 89) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
		
	}

	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		int numAluno,inic=1;
		double nota,total,notaS=0;


		System.out.println("Digite o numero de alunos que serão utilizadas: ");
		numAluno = ent.nextInt();

		while (inic<=numAluno) {

			System.out.println("Digite a media de notas: ");
			nota = ent.nextDouble();

			inic++;
			media(nota);
		}


	}

}
