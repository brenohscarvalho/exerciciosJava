package lista3;

import java.util.Scanner;

public class exercicio7 {
	public static boolean tf (int a) {
		//utilização de boolean para definir retorno de true ou false referente ao valor digitado no main
		if (a>0) {
			return(true);
		}
		else {
			return (false);
		}


	}
	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int val,inic=1,n;

		
		System.out.println("Digite o valor de N");
		n = ent.nextInt();
		
		while (inic<=n) {
			
	
		System.out.println("Digite o valor inteiro:");
		val = ent.nextInt();
		
		System.out.println(""+tf(val));
		inic++;
		}
		
	}

}
