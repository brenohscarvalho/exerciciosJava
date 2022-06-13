package listaDeExercicios2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) 
	{

		Scanner ent = new Scanner(System.in);
		double compra=0, venda=0,bruto,lucro;
		double lucro10=0,lucro1020=0,lucro20=0;
		double totalC,somaCompra=0,totalV,somaVenda=0,somaLucro=0,totalL;
		char sair=1;
		while (sair!='p'){
/*Basicamente eu pensei em criar uma estrutura de repetção com "venda e compra", 
 *depois utilizo dos valores fornecidos pelo cliente para fazer o calculo do lucro
 *e dentro de um if ser destinado a quanto de lucro ele obteve*/
			System.out.println("Digite o valor de compra");
			compra = ent.nextDouble();

			System.out.println("Digite o valor de venda ");
			venda = ent.nextDouble();


			bruto= venda-compra;
			lucro = (bruto/compra)*100;			

			totalL=lucro;
			somaLucro=totalL+lucro;

			if (lucro<10){

				lucro10++;
			}
			if (10 <= lucro && lucro <= 20) {
				lucro1020++;
			}
			if (venda<compra) {
				System.out.println("Lucro não obtido ");
			}
			else if (lucro>20) {
				lucro20++;
			}
/*Utilizo p para parar o codigo e depois com outras variaveis salvo valores ja fornecidos anteriormente para serem somados
 * e ter o valor total de compra venda e lucro */
			System.out.println("Digite p para sair ou qualquer outro caracter para continuar: ");
			sair = ent.next().charAt(0);

			totalC=compra;
			somaCompra=totalC+compra;			
			totalV=venda;
			somaVenda=totalV+venda;
		}
		System.out.println("Total de Lucros<10%: "+lucro10);
		System.out.println("Total de 10% <= lucro <= 20%: "+lucro1020);
		System.out.println("Total de Lucros>20%: "+lucro20); System.out.println("");
		
		System.out.printf("Total somado de compras é: %.0f\n",somaCompra);
		System.out.printf("Total somado de vendas é: %.0f\n",somaVenda);
		System.out.printf("O Total de lucro foi de: %.0f",somaLucro); System.out.print("%");
	}

}


