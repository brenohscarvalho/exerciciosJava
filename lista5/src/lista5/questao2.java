package lista5;
import java.util.Scanner;
public class questao2 {
	public static void exibe(int[]vet) {
		//exibição por procedimento
		for(int i=0;i<vet.length;i++) {
			System.out.print(" " +vet[i]);
			
		}
		System.out.println();
	}
	public static int []test (int[]vet) {
		int vetneg=0;
		//numero de valores negativos
		for(int i=0; i<vet.length;i++) {
			if (vet[i]<0) {
				vetneg++;
			}
		}
		//criação do vetor negativo com vetneg
		int [] neg = new int[vetneg];
		int j=0;
		for(int i=0; i<vet.length;i++) {
			if(vet[i]<0) {
				neg[j] = vet[i];
				j++;
			}
		}
		return neg;
	}
	public static void prevet (int [] vet) {
		//preencha vetor 
		Scanner ent = new Scanner(System.in);

		for(int i= 0; i < vet.length; i++) {

			System.out.println("Digite o valor: ");

			vet [i] = ent.nextInt();
		}
	}
	public static void main(String[] args) {
		 //criação de  um  vetor + procedimentos
		Scanner ent = new Scanner(System.in);

		int vet [] = new int[10];

		prevet(vet);

		exibe(vet);

		exibe(test(vet));

	}

}
