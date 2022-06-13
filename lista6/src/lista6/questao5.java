package lista6;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String telex;

		System.out.println("Digite o numero de telefone (excluindo o DDD): ");
		telex = ent.nextLine().trim();
		//if para situa��es com tra�o
		if (telex.length()<=10 && telex.length()>=8) {
			if(telex.contains("-")){
				//e j� tiver presente nove digitos
				if(telex.length()==9) {
					StringBuilder telefone = new StringBuilder();
					telefone.append('9').append(telex);
					//impress��o com formata��o
					System.out.println("Telefone corrigido com formata��o: "+telefone);
				}
				else {
					//impress��o sem formata��o
					System.out.println("Telefone corrigido sem formata��o: "+ telex);
				}
			}
			//if para situa��es sem tra�o
			else if (!telex.contains("-")) {
				//e tiver oito digitos
				if(telex.length()==8) {
					StringBuilder telefone = new StringBuilder();
					telefone.append('9').append(telex);
					//caso sem formata��o
					System.out.println("Telefone corrigido sem formata��o:"+telefone);
				}
				else {
					//caso com formata��o
					System.out.println("Telefone corrigido com formata��o: "+ telex);
				}
			}
		}
		else {
			System.out.println("Numero invalido ");
		}

	}

}
