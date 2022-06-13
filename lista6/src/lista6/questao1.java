package lista6;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String nome;
		//preenchimento do nome 
		System.out.println("Digite um nome: ");
		nome = ent.nextLine().trim();
		//split na string para separar o nome em posições
		String [] vetnome = nome.split(" ");
		//conectores utlizados para serem retirados dento do for 
		String conectores = "e do da dos das de  di  du";
		
		StringBuilder inicial = new StringBuilder();
		
		for(int i=0;i<vetnome.length;i++) {
			//utilizei do if junto do for para passar palavra por palavra e ir pegando as primiera letras presentes na posição e serem guardas na StringBuilder inicial
			if (conectores.contains(vetnome[i])==false) {
				inicial.append(Character.toUpperCase(vetnome[i].charAt(0)));
			}
		}
			System.out.println(inicial);
	}

}
