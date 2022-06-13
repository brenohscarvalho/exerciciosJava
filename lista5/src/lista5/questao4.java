package lista5;

import java.util.Random;
import java.util.Scanner;

public class questao4 {
	public static int linha4(int [][]m) {
		//calculo soma linha 4
		int salva=0;
		for(int c=0;c<m.length;c++) {
			salva+=m[3][c];
		}
		return salva;
	}
	public static int coluna2(int [][]m) {
		int salva=0;
		//calculo soma coluna 2
		for(int l=0;l<m.length;l++) {
			salva+=m[l][2];
		}
		return salva;
	}
	public static int diagPri(int[][] m) {
		// soma da diagonal principal
		int salva=0;
		for (int i=0;i<m.length;i++) {
			salva+=m[i][i];
		}
		return salva;
	}
	public static int diagSec(int[][] m) {
		// soma da diagonal secundaria
		int salva=0,c=m.length-1;

		for (int l=0;l<m.length;l++) {
			salva+=m[l][c--];	
		}
		return salva;
	}
	private static int todos(int[][] m) {
		//soma todos os valores
		int salva=0;
		for(int l=0;l<m.length;l++) {
			for (int c=0;c<m[0].length;c++) {
				salva+=m[l][c];
			}
		}
		return salva;
	}
	public static int opc(int [][]m,char escolha){
		
		//fiz uma escolha para cada uma das situações 
		if(escolha=='a'||escolha=='A') {
			return (linha4(m));
		}

		else if (escolha=='b'||escolha=='B') {
			return (coluna2(m));
		}

		else if (escolha=='c'||escolha=='C') {
			return (diagPri(m));
		}

		else if (escolha=='d'||escolha=='D') {
			return (diagSec(m));
		}

		else if (escolha=='e'||escolha=='E') {
			return (todos(m));
		}

		else {
			System.out.println("invalido");
			return 0;
		}
	}

	public static void pree(int [][]m) {
		Random random = new Random();
		//preenchimento
		for(int i=0 ;i<m.length;i++) {
			for (int j=0;j<m.length;j++) {
				m[i] [j]  = random.nextInt(5);
			}
			exibe(m);
		}
	}
	public static void exibe (int [][]m) {
		//exibição do exibe
		for(int i=0;i<m.length;i++) {
			for (int c=0;c<m[0].length;c++) {
				System.out.print(m[i][c]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		char escolha;
		//matriz M 5 x 5 e preenchimento no main
		int [][] matri = new int [5][5];
		
		pree(matri);
		System.out.println("Escolha entre as opções a,b,c,d,e;");
		escolha = ent.next().charAt(0);

		System.out.println(opc(matri,escolha));

	}

}
