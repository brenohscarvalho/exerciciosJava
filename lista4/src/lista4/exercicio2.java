package lista4;

import java.util.Scanner;

public class exercicio2 {
	public static int divi(int n,int d,int r) {
		if (n>=d) {
			//utilizei a variavel r para salvar o numero de vezes que foi executado a divisão por subtração
			r++;
			return divi(n-d,d,r);
		}
		else{
			return(r);
		}
	}
	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int deno, nume,res=0;

		System.out.println("Digite o numerador e o denominador: ");
		nume = ent.nextInt();
		deno = ent.nextInt();

		System.out.println(divi(nume,deno,res));
		ent.close();

	}

}
