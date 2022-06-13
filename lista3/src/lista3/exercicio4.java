package lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void triang (double X,double Y,double Z) {
		//teste de valores digitados para saber se realmente é um trinagulo:
		if(X>0 && Y>0 && Z>0 && (X<Y+Z) && (Y<X+Z) && (Z<Y+X)) {	
			
			if (X == Y && X == Z) {
				System.out.println("Triângulo Equilátero");
			}
			else if (X == Y || X==Z||Y ==Z ) {
				System.out.println("Triângulo Isósceles: ");
			}
			else {
				System.out.println("Triângulo Escaleno: ");
			}	
		}
		else {
			//se nao entra no caso não triangulo
			System.out.println("Não Triângulo:");
		}
	}
	public static void main(String[] args) 
	{

		Scanner ent = new Scanner (System.in);
		double X,Y,Z;
		char para=0;
		//repetição com valores de X,Y e Z para serem digitados com p para parar
		while(para!='p') {
			System.out.println("Digite o X de um lado triangulo: ");
			X = ent.nextDouble();
			System.out.println("Digite o Y de um lado triangulo: ");
			Y = ent.nextDouble();
			System.out.println("Digite o Z de um lado triangulo: ");
			Z = ent.nextDouble();

			triang (X,Y,Z);
			
			System.out.println("Digite p para parar o resultado ou c para continuar: ");
			para = ent.next().charAt(0);
		}
	}

}
