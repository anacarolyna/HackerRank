package Teste;

import java.util.Scanner;

public class AlgoritmoExc6 {

	public static void main(String[] args) {
		double velocidadeVeiculo, velocidadeLeve, velocidadeMedia, velocidadeGrave, velocidadeGravissima;
		
		velocidadeLeve = 50 * 1.1;
		velocidadeMedia = 70;
		velocidadeGrave = 90;
		velocidadeGravissima =  110;
		
				
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a velocidade que o veículo passou: ");
		velocidadeVeiculo = leia.nextDouble();
		
	    if (velocidadeVeiculo <= velocidadeLeve) {
	    	System.out.println("Isento");
	    	
	    } else if (velocidadeVeiculo <= velocidadeMedia) {
	    	System.out.println("3 pontos na carteira");
	    } else if (velocidadeVeiculo <= velocidadeGrave) {
	    	System.out.println("4 pontos na carteira");
	    	
	    }else if (velocidadeVeiculo <= velocidadeGravissima){
	    	System.out.println("5 pontos na carteira");
	    	
	    }
	    	
	    
	}

}
