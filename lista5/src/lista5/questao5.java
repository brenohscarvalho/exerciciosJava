package lista5;

import java.util.Scanner;

public class questao5 {
	public static int [][] dif (int [][] a, int[][] b) {

		//calculo de diferença
		int[][] d = new int[4][6];

		for (int l=0;l<a.length;l++) {
			for (int c=0;c<a[0].length;c++) {
				d[l][c]= a[l][c] - b[l][c];
				System.out.print(" "+d[l][c]);
			}
			System.out.println("");
		}
		return d;
	}

	public static int [][] soma (int [][] a, int[][] b) {
		//calculo de soma 
		int[][] s = new int[4][6];
		
		for (int l=0;l<a.length;l++) {
			
			for (int c=0;c<a[0].length;c++) {
				s[l][c]= a[l][c]+ b[l][c];
				System.out.print(" "+s[l][c]);

			}
			System.out.println("");
		}
		return s;
	}
	public static void opc(int [][] a, int[][] b) {
		Scanner ent = new Scanner(System.in);
		char escolha;
		System.out.println("Digite S para soma de a e b: ");
		System.out.println("Ou digite D para a diferença de a e b:");
		escolha = ent.next().charAt(0);

		if(escolha=='s'||escolha=='S') {
			System.out.println(soma(a,b));
		}
		else if (escolha=='d'||escolha=='D') {
			System.out.println(dif(a,b));
		}
	}
	public static void preen(int [][] a, int [][] b) {
		Scanner ent = new Scanner(System.in);
		//preenche matriz a 

		for (int l=0;l<a.length;l++) {
			for (int c=0;c<a[0].length;c++) {
				System.out.println("Digite os valores de A: ");
				a[l][c] = ent.nextInt();
			}
		}

		System.out.println(" Matriz preenchida ");
		System.out.println();

		//preenche matriz b
		for (int l=0;l<b.length;l++) {
			for (int c=0;c<a[0].length;c++) {
				System.out.println("Digite os valores de B: ");
				b[l][c] = ent.nextInt();
			}
		}
		System.out.println(" Matriz preenchida ");
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int [][] a = new int [4][6]; 
		int [][] b = new int [4][6];



		preen (a,b);
		opc(a,b);
	}

}
