package aula_04.exercícios;

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		
		do { 
			
			System.out.println("Informe um número: ");
			numero = leia.nextInt();
			
			if (numero != 0 && numero %3 == 0) {
				soma += numero;
				contador++;		
		}
		
		} while (numero != 0);
		
		System.out.println("\n++++++++++++++++MENU++++++++++++++++++\n");
		
		if (contador > 0) {
			
			double media = (double) soma / contador;
		
			System.out.printf("A média dos núemro múltiplos de 3 é %.2f!", media);
				
			} else {
				
		        System.out.println("Nenhum número múltiplo de 3 foi digitado!");
		        }
			

			leia.close();  
			
	}

}
