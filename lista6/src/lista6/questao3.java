package lista6;

import java.util.Scanner;

public class questao3 {
//parse
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String data;
		
		System.out.println("Digite a data do seu nascimento: ");
		data = ent.nextLine().trim();
		//split para colocar todos em posi��es do vetor + tirar as barras presentes na data digitada
		String[] dataF = data.split("/");
		//utilizei um vetor com m�s por extenso para relacionar junto ao m�s digitado por ele ja na posi��o 1
		String[] meses = {"Janeiro","Fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		int dia = Integer.parseInt(dataF[0]);
		int mes = Integer.parseInt(dataF[1]);
		//e a formata��o junto as posi��es no split 0 = data, mes = -1, ano = 2
		if(dia>0 && dia<=31) {
			System.out.println("Voc� nasceu no dia "+ dataF[0]+" de "+ meses[mes-1]+" do ano "+ dataF[2]);
        }
		else {
		 System.out.println("Data inv�lida");
		}
	}

}
