package Java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	   
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	      System.out.println((n%2==1 || (n>=6 && n<=20)) ? "Weird" : "Not Weird");
	        scanner.close();
	        
	}
}

