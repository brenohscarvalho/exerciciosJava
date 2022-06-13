package lista5;

import java.util.Random;

public class questao6 {

	public static void main(String[] args) {
		/*na maioria dos casos utilizei a logica de salvar os valores em um vetor ou  e depois "troco" 
		com entre a coluna ou linha referente do exercicio*/
		int [][] m = new int  [10][10];

		preencha(m);

		troca1(m);
		troca2(m);
		troca3(m);
		troca4(m);
	}
	public static void preencha(int [][]m) {
		Random random = new Random();
		//for de preencher a matriz
		for(int l=0;l<m.length;l++) {
			for (int c=0;c<m[l].length;c++) {
				m[l][c] = random.nextInt(10);
			}
		}
		System.out.println("Matriz principal:  ");
		exibe(m);
		System.out.println();
	}

	public static void troca1(int [][]m){
		//troca 1 = linha 2 com a linha 8
		int [] v = new int  [10];
		for(int i=0;i<m.length;i++) {
			v[i] = m[1][i];
			m[1][i] = m[7][i];
			m[7][i] = v[i];
		}
		System.out.println("Matriz linha 2 com a linha 8:  ");
		exibe(m);
		System.out.println();
	}
	public static void troca2(int [][]m){
		int [] v = new int [10];
		//troca 2 = coluna 4 com a coluna 10
		for(int i=0;i<m.length;i++) {
			v[i] = m[i][3];
			m[i][3] = m[i][9];
			m[9][i] = v[i];
		}
		System.out.println("Matriz a coluna 4 com a coluna 10:  ");
		exibe(m);
		System.out.println();
	}
	public static void troca3(int [][]m) {
		int c=m.length-1;
		//troca 4 a diagonal principal com a diagonal secundária
		for (int i=0;i<m.length;i++) {
			int col = c-i;

			int princ = m[i][i];
			m[i][i]= m[i][col];
			m[i][col]= princ;
		}
		System.out.println("Matriz a diagonal principal com a diagonal secundária: ");
		exibe(m);
		System.out.println();
	}
	public static void troca4(int[][]m) {
		int [] v = new int [10];
		//troca 4 entre linha 5 com a coluna 10
		for(int i=0;i<m.length;i++) {
			v[i] = m[4][i];
			m[4][i] = m[i][9];
			m[i][9] = v[i];
		}
		System.out.println("Matriz a linha 5 com a coluna 10: ");
		exibe(m);
		System.out.println();
	}

	public static void exibe (int [][]m) {

		for(int i=0;i<m.length;i++) {
			for (int c=0;c<m[0].length;c++) {
				System.out.print(m[i][c]);
			}
			System.out.println();
		}
	}
}
