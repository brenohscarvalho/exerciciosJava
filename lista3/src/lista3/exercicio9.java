package lista3;

import java.util.Scanner;

public class exercicio9 {

	public static double aprov (double a) {
		Scanner ent = new Scanner(System.in);
		double aprov=0,med;
		double nota=2,inic=1;
//repetição de notas com o criterio de >=6 para contar a aprovação
		while (inic<=a) {
			
			System.out.println("Digite a sua nota:");
			nota = ent.nextDouble();

			if (nota>=6) {

				aprov++;

			}
			inic++;
		}
		//calculo para fazer a media de alunos aprovados de acordo com a nota
		med=(aprov*100)/a;
		return(med);

	}

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		double aluno;


		System.out.println("Digite o numero de alunos: ");
		aluno = ent.nextDouble();

		System.out.println(aprov(aluno)+"%");



	}

}
