package lista3;

import java.util.Scanner;

public class exericios10 {

	public static char tabNadador (int a) {
		
		//tabela referente a idade e categoria do atleta
		if(a>=5&&a<=7) {
			return('F');
		}
		else if (a>=8&&a<=10) {
			return('E');
		}
		else if (a>=11&&a<=13) {
			return('D');
		}
		else if (a>=14&&a<=15) {
			return('C');
		}
		else if (a>=16&&a<=17) {
			return('B');
		}
		else {
			return('A');
		}



	}
	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int idade;

		System.out.println("Digite a idade do atleta: ");
		idade = ent.nextInt();

		System.out.println(tabNadador(idade));
	}

}
