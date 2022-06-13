package lista5;
import java.util.Scanner;
public class questao1 {

		public static void med(int [] vet) {
			//calculo de medias
			int x=0,aprov=0;
			for (int i=0; i<vet.length;i++) {
				x += vet[i];	
			}
			//contagem de alunos aprovados de acordo com as medias
			x = x/vet.length;
			for(int i=0;i<vet.length;i++) {
				if (vet[i]>x) {
					aprov++;
				}
			}
			System.out.println("A media dos alunos é: "+ x);
			System.out.println("A quantidade de alunos aprovados: "+aprov);
		}
		
		//preenche o vetor
		public static void notas (int [] vet) {
			Scanner ent = new Scanner(System.in);
			
			for(int i= 0; i < vet.length; i++) {
				System.out.println("Digite o valor da nota: ");
				 
				vet [i] = ent.nextInt();
			}
			
		}
		public static void main(String[] args) {
			//main apenas com a criação do vetor e procedimentos
			Scanner ent = new Scanner(System.in);
			int vet [] = new int[10];
			
			notas(vet);
			med (vet);

		}

	}

