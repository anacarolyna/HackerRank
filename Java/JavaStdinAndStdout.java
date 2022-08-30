package Java;

import java.util.Scanner;

public class JavaStdinAndStdout {
	
	public static void main(String[] args) {
		
		
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 3 números: ");
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
      

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}

