package lista6;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String telex;

		System.out.println("Digite o numero de telefone (excluindo o DDD): ");
		telex = ent.nextLine().trim();
		//if para situações com traço
		if (telex.length()<=10 && telex.length()>=8) {
			if(telex.contains("-")){
				//e já tiver presente nove digitos
				if(telex.length()==9) {
					StringBuilder telefone = new StringBuilder();
					telefone.append('9').append(telex);
					//impressção com formatação
					System.out.println("Telefone corrigido com formatação: "+telefone);
				}
				else {
					//impressção sem formatação
					System.out.println("Telefone corrigido sem formatação: "+ telex);
				}
			}
			//if para situações sem traço
			else if (!telex.contains("-")) {
				//e tiver oito digitos
				if(telex.length()==8) {
					StringBuilder telefone = new StringBuilder();
					telefone.append('9').append(telex);
					//caso sem formatação
					System.out.println("Telefone corrigido sem formatação:"+telefone);
				}
				else {
					//caso com formatação
					System.out.println("Telefone corrigido com formatação: "+ telex);
				}
			}
		}
		else {
			System.out.println("Numero invalido ");
		}

	}

}
