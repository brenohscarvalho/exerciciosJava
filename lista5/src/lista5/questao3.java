package lista5;

import java.util.Scanner;

public class questao3 {
	public static void exibe (int[]xy) {
		
		for(int i=0;i<xy.length;i++) {
			System.out.print(xy[i]+" ");
		}
	}
	public static void receba (int []x,int[]y) {
		//elemento dos vetores intercalados entre x e y com a criação do vetor xy de tamnaho 20 para armazenar esses valores
		int a=0,b=0;
		int []xy = new int[20];
			
		for (int i=0; i<xy.length;i++) {
			
			if (i%2==0) {
				xy[i]=x[a];
				a++;
			}
			//Exemplo: valor x,valor y,valor x... e assim por diante.
			else {
				xy[i]=y[b];
				b++;
			}
		}
		System.out.println("O vetor de xy é: ");
		exibe(xy);
	}
	public static void pree (int[]x,int[]y) {
	Scanner pre = new Scanner(System.in);
		//preenche  2  vetores  X  e  Y
	
		for(int i=0;i<x.length;i++) {
			System.out.println("Digite o valor de x: ");
			x[i] = pre.nextInt();
		}
		
		for(int j=0;j<y.length;j++) {
			System.out.println("Digite o valor de y: ");
			y[j] = pre.nextInt();
		}
		
		
		
	}
	public static void main(String[] args) {
		//vetor x e y
		Scanner ent = new Scanner(System.in);
		int [] x = new int[10];
		int [] y = new int [10];
		
		pree(x,y);
		receba(x,y);
	}

}
