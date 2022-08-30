package Teste;

import java.util.Scanner;

public class AlgoritmoExc5 {

	public static void main(String[] args) {
		int n1, n2, soma, subtracao, multplicacao;
		double divisao;
		
		Scanner leia = new Scanner(System.in);
        System.out.println("N1 :");
        n1 = leia.nextInt();
        System.out.println("N2 :");
        n2 = leia.nextInt();
        soma = n1 + n2;
        subtracao = n1- n2;
        multplicacao = n1 * n2;
        divisao = n1 / n2;
        System.out.println(soma);
        
	}

}
