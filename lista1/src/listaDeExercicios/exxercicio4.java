package listaDeExercicios;

import java.util.Scanner;

public class exxercicio4 {

	public static void main(String[] args) 
	{

		Scanner ent = new Scanner (System.in);
		double salario, hab=0, salariosoma=0, mediaS;
		double filhos, somafilhos=0, mediaF;
		double Msalario=0;
		double salario100=0;

		System.out.println("Digite o valor do salario: ");
		salario = ent.nextDouble();
		
		System.out.println("Digite o numero de filhos: ");
		filhos = ent.nextDouble();
		

		while (salario>0) {

			hab++;
			salariosoma+=salario;
			mediaS = salariosoma/hab;
			System.out.println("Digite o valor do proximo salario(Digite 0 para parar): ");
			salario = ent.nextDouble();
			somafilhos+=filhos;
			mediaF = somafilhos/hab;
			
			if (Msalario<salario) {
				Msalario= salario;
			}
			if (salario<=100) {
				salario100++;
			}
			
			if (salario<=0) {		
				System.out.println("Media salarial: "+mediaS);
				System.out.println("Media de filhos: "+mediaF);
				 System.out.printf("O maior salário da população é de: %.2f \n" , Msalario);
				 System.out.printf("Media salarios até R$100 é de: %.2f \n",(salario100*100)/hab);
				}
			else {
				System.out.println("Digite o numero de filhos: ");
				filhos = ent.nextDouble();
			}
			
		}
		 ent.close();
	}
}

