package listaDeExercicios2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
        int val;
        double Pposi,Pneg,Pzero,posi=0,neg=0,zero=0,total;
        char parar=0;
     //Declaração das variáveis.
        
        while (parar != 'p') {
            System.out.println("Digite uma sequência de valores inteiros ");
            val = ent.nextInt();

            if(val>0) {
                posi++;
            }
            else if (val<0) {
                neg++;
            }
            else {

                zero++;
            }

            System.out.println("Utilize p para parar ");
            parar= ent.next().charAt(0);
        }
      //Aproveitei a mesma base da questão 1 mais utilizei da formula de calculo de procentagem com variaveis expecificas que foi exigido atividade.
        total = posi + neg + zero;
        Pposi=((posi/total)*100);
        Pneg=((neg/total)*100);
        Pzero=((zero/total)*100);

        System.out.printf("Os valores positivos são: %.1f",Pposi); System.out.print("%\n");
        System.out.printf("Os valores negativos são: %.1f",Pneg); System.out.print("%\n");
        System.out.printf("Os valores de zero são: %.1f",Pzero); System.out.print("%\n");
		
	}

}
