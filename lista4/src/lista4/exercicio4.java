package lista4;

import java.util.Scanner;

public class exercicio4 {

	public static int divi(int x, int y) {

		if(x<y) {
			return (x);
		}//sem utilizar o % "resto". Só foi adicionado o caso de x == y de diferente da 3 para ter todos os casos MOD's.
		else if (x==y){
			return (0);
		}
		return divi (x-y,x);

	}
	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		int x,y;

		System.out.println("Digite o numerador e o denominador: ");
		x = ent.nextInt();
		y = ent.nextInt();

		System.out.println(divi(x,y));
		ent.close();
	}

}
