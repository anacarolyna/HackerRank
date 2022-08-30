package Teste;

import java.util.Scanner;

public class AlgoritmoExc4 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		int numero1, numero2, numero3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Palavra 1: ");
		palavra1 = leia.next();
		System.out.println("Palavra 2: ");
		palavra2 = leia.next();
		System.out.println("Número 1: ");
		numero1 = leia.nextInt();
		System.out.println("Número 2: ");
		numero2 = leia.nextInt();
		palavra3 = palavra1 + palavra2;
		numero3 = numero1 + numero2;
		System.out.println(palavra3);
		System.out.println(numero3);
		
		
	}

}
