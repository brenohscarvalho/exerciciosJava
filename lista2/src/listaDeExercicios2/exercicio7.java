package listaDeExercicios2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int voto,para=1;
		int voto1=0, voto2=0, voto3=0,voto4=0,branco=0,nulo=0;
		System.out.println("Digite ente 1 a 4 qual é o seu candidato:\n5 para nulo e 6 para branco \n 1- Farid \n 2- Nilce Moretto \n 3- Gabriel Barbosa \n 4- Givanildo \n");
		voto = ent.nextInt();
/*Fiz um sistema de repetção com escolhas de 1 a 4 para os votos
 *Nulo = 5 e branco = 6*/
		while(voto!=0) {


			switch (voto) {
			case 1:
				System.out.println("Você votou no candidato 1 - Farid\n");
				voto1++;
				break;

			case 2:
				System.out.println("Você votou no candidato 2 - Nilce Moretto\n" );
				voto2++;
				break;

			case 3:
				System.out.println("Você votou no candidato 3 - Gabriel Barbosa\n");
				voto3++;
				break;

			case 4:
				System.out.println("Você votou no candidato 4 - Givanildo\n");
				voto4++;
				break;

			case 5:
				System.out.println("Você anulou seu voto\n");
				nulo++;
				break;

			case 6:
				System.out.println("Você votou em branco\n ");
				branco++;
				break;

			default: System.out.println("Valor invalido\n ");
			break;

			}
			System.out.println("Digite ente 1 a 4 qual é o seu candidato:\n5 para nulo e 6 para branco \n 1- Farid \n 2- Nilce Moretto \n 3- Gabriel Barbosa \n 4- Givanildo");

			System.out.println("Digite 0 para parar a votação");
			voto = ent.nextInt();

		}
		System.out.println("O total de votos para o candidato 1: " +voto1);
		System.out.println("O total de votos para o candidato 2: " +voto2);
		System.out.println("O total de votos para o candidato 3: " +voto3);
		System.out.println("O total de votos para o candidato 4: " +voto4);
		System.out.println("O total de votos nulos: " +nulo);
		System.out.println("O total de votos brancos: "+branco);
		ent.close();

	}

}
