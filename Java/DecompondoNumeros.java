 package Java;
/*
 * Complete a seguinte função para que a mesma devolva todos os possíveis números  
 *  de 4 dígitos, onde cada um seja menor ou igual a 
 *   soma dos dígitos de cada número gerado seja 21     
 * Exemplos con maxDigit=6: 3666, 4566
 */

public class DecompondoNumeros {

	public static void main(String[] args) {
		int maxDigit = 9999;
		int soma = 0;
		
		
		for (int n=1000; n<=maxDigit; n++) {
		String num = String.valueOf(n);
		char [] digitos = num.toCharArray();
		
		int valor0 = Integer.parseInt(String.valueOf(digitos[0]));
		int valor1 = Integer.parseInt(String.valueOf(digitos[1]));
		int valor2 = Integer.parseInt(String.valueOf(digitos[2]));
		int valor3 = Integer.parseInt(String.valueOf(digitos[3]));
		
		
		soma = valor0 + valor1 + valor2 + valor3;
		
		if (soma == 21) {
			System.out.println(n);
			
		} else System.out.println(0);
		 
		 
				
			}
			
		}
		

	}


