package lista4;

import java.util.Scanner;

public class exercicio5 {

	public static double fat(double n) {
		//resolvo apenas um fatorial de forma decrescente de n e envio para serie:
		if (n==1) {
			return (1);	
		}
		else {
			return (fat(n-1)*n);
		}
	}
	public static double serie(int n) {
		//com o calculo de fat feito: "salvo" nas series e após isso será resolvendo as adições referentes as series em ordem de prioridade. 
		if(n==1) {
			return(1);
		}
		return(serie(n-1) + (1/fat(n)));
	}
	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int n;
		System.out.println("Digite o valor de n: ");
		n = ent.nextInt();

		System.out.println(serie(n));
		ent.close();
	}

}
