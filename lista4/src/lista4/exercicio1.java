package lista4;

import java.util.Scanner;

public class exercicio1 {

	public static int somaD (int num) {
		
		int soma=0;
		if (num<1) {
			return(num);
		}
		//utilizei o resto por 10 para os valores digitados serem "separados" 
		soma+= num % 10;
		//somados. depois divido num para reposicionar o proximo valor a ser separado pelo resto da divisão por 10
		return(soma+somaD(num/10));


	}
	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int n;
		
		System.out.println("Digite o valor de N: ");
		n = ent.nextInt();
		
		System.out.println(somaD(n));
		ent.close();
	}

}
