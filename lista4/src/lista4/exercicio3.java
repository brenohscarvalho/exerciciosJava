package lista4;

import java.util.Scanner;

public class exercicio3 {
	public static int divi(int n, int d) {

		if(n<d) {
			return (n);
		}	//com o retorno de n seguindo a logica da divisão por subtração, o valor de n representa o resto
		return divi (n-d,d);

	}
	public static void main(String[] args)
	{

		Scanner ent = new Scanner(System.in);
		int num,deno;

		System.out.println("Digite o numerador e o denominador: ");
		num = ent.nextInt();
		deno = ent.nextInt();

		System.out.println(divi(num,deno));
		ent.close();
	}

}
