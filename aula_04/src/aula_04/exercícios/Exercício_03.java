package aula_04.exercícios;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int menor21 = 0, maior50 = 0;
		
		System.out.println("Informe a idade: ");
		int idade = leia.nextInt();
		
		while (idade >= 0) {
			if (idade < 21) {
				menor21++;
	
		} else if (idade > 50) {
				maior50++;					
		}
			System.out.println("\nInforme a idade: ");
			idade = leia.nextInt();
			
		}
		
		 System.out.println("\nTotal de pessoas menores de 21 anos é " + menor21);
	     System.out.println("\nTotal de pessoas maiores de 50 anos é " + maior50);
	       
	     leia.close();
	}

}
