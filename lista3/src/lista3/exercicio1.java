package lista3;

import java.util.Scanner;

public class exercicio1 {
	public static void calcnotas (double n1, double n2, double n3, char letra){
		//Calculo m�dia aritm�tica
		if (letra == 'A' || letra == 'a') 
		{
			System.out.println("Sua m�dia aritm�tica �: "+(n1+n2+n3)/3);
		}
		//Calculo m�dia ponderada
		else if (letra == 'P' || letra == 'p')
		{
			System.out.println("Sua m�dia ponderada com pesos (5, 3 e 2): "+ (n1*5+n2*3+n3*2)/(5+3+2));
		}

	}
	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		double nota1,nota2,nota3,n,inicio=0;
		char letra;


		System.out.println("Digite o N de alunos que far�o o calculo de suas notas: ");
		n = ent.nextDouble();

		while(inicio<=n) {


			System.out.println("Digite a primiera nota");
			nota1 = ent.nextDouble();

			System.out.println("Digite a segunda nota");
			nota2 = ent.nextDouble();

			System.out.println("Digite a terceira nota");
			nota3 = ent.nextDouble();
			//pedido de A para m�dia aritm�tica ou P para  m�dia ponderada
			System.out.println("Digite Letra A ou a para m�dia aritm�tica"
					+ "\nOu Letra P ou p para ponderada.");
			letra = ent.next().charAt(0);

			calcnotas(nota1,nota2,nota3,letra);
			inicio++;
		}
	}

}
