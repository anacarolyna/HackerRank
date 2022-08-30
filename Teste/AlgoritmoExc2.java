package Teste;

import java.util.Scanner;

public class AlgoritmoExc2 {

	public static void main(String[] args) {
		double n1, n2, n3, media, soma;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Nota 1:");
		n1 = leia.nextInt();
		System.out.println("Nota 2:");
		n2= leia.nextInt();
		System.out.println("Nota 3:");
		n3 =leia.nextInt();
		
//		soma = n1 + n2 + n3;
		media = (n1 + n2 + n3)/3;
		
		if (media >= 7) {
			System.out.println("Aprovado"+ media);
			
		}else if (media <5){
			System.out.println("Reprovado"+ media);
		
	     } else {
	    	 System.out.println("Recuperação"+ media);
	     }

	}
}
