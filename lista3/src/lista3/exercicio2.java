package lista3;

import java.util.Scanner;

public class exercicio2 {

	public static void prefeitura(double sal, double filhos) {
		System.out.println("A m�dia do salario da popula��o com base no numero de filhos �:" + (sal/filhos));
		//calculo apenas de media salarial com base em filhos
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double salario=1,totalFilhos=0, totalSalario=0;
		int filhos=1;


		while(salario>0) {
			//while com soma de salarios e filhos
			System.out.println("Digite o valor do seu sal�rio ou digite '0' para parar");
			salario = ent.nextDouble();
			totalSalario= totalSalario + salario;

			System.out.println("Digite a quantidade de filhos na sua fam�lia:");
			filhos = ent.nextInt();
			totalFilhos= totalFilhos+filhos;

		}
		prefeitura(totalSalario,totalFilhos);

	}

}
