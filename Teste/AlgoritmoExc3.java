package Teste;

import java.util.Scanner;

public class AlgoritmoExc3 {

	public static void main(String[] args) {
		String nome, sobrenome, nomeCompleto;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		nome = leia.next();
		System.out.println("Escreva seu sobrenome: ");
		sobrenome = leia.next();
		nomeCompleto = nome +" "+ sobrenome;
		System.out.println("Nome Completo: "+nomeCompleto);

	}

}
