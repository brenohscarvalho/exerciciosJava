package listaDeExercicios2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) 
	{
		
		Scanner ent = new Scanner(System.in);
		int val,posi=0,neg=0,zero=0;
		char parar=0;
		//declaracao das variáveis
		// Como os valores solicidados foram positivos, negativos e nulos. Achei interessante o uso de caracter "p" para parar o codigo 
		while (parar != 'p') {
			System.out.println("Digite uma sequência de valores inteiros: ");
			val = ent.nextInt();

			if(val>0) {
				posi++;
			}
			else if (val<0) {
				neg++;
			}
			else {

				zero++;
			}
			System.out.println("Utilize p para parar: ");
			parar= ent.next().charAt(0);
		}
		System.out.println("Os valores positivos são: "+posi);
		System.out.println("Os valores negativos são: "+neg);
		System.out.println("Os valores de zero são: "+zero);




	}





}
