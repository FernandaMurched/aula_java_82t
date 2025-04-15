package aula_03;

import java.util.Scanner;

public class Exercicio01_Aula03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja verificar: ");
		int numero = leia.nextInt();
		
		 boolean par = numero % 2 == 0; 
		 boolean positivo = numero >= 0;
		 
		 if (par & positivo) {
			 
	     System.out.println("O número digitado é:" + numero + " par e positivo!");
	        } else if (par & !positivo) {
	        	
	     System.out.println("O número digitado é:" + numero + " par e negativo!");
	        } else if (!par & positivo) {
	        	
	     System.out.println("O número digitado é:" + numero + " ímpar e positivo!");
	        } else {
	        	
	     System.out.println("O úmero digitado é:" + numero + " ímpar e negativo!");
	        }

	        leia.close();
	}

}
