package lista3;

import java.util.Scanner;

public class exercicio8 {

	public static double form (int n) {
		double res=0,inic=1;
		//utilizei a base da formula representada no exercicio com uma repetição para a resoução 
		while (inic<=n) {
		
		res += (inic*inic+1)/(inic+3);
		inic++;
		}
		return(res);
	}
	
	public static void main(String[] args) 
	{	
		Scanner ent = new Scanner(System.in);
		int n;
		//entrada de n
		System.out.println("Digite o valor N: ");
		n = ent.nextInt();
		
		System.out.println("O valor de S: "+form(n));
		
		
	}

}
