package aula_04.exercícios;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int númeroPar = 0, númeroÍmpar = 0;

		 for (int i = 1; i <= 10; i++) {
			 System.out.print("Digite o " + i + "º número: ");
	            int numero = leia.nextInt();
	            
	            if (numero % 2 == 0) {	          
	            	númeroPar++;
	            	
	            } else {	           
	            	númeroÍmpar++;
	            }}
		 	           	             
	        System.out.println("\nO total de números pares: " + númeroPar);
	        System.out.println("\nO total de números ímpares: " + númeroÍmpar);

	        leia.close();		
	}

}
