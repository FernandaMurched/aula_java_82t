package aula_03;

import java.util.Scanner;

public class Exercício05_Aula03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o número A: ");
		int a = leia.nextInt();
		
		System.out.println("\nDigite o número B: ");
		int b = leia.nextInt();
		
		System.out.println("\nDigite o número C: ");
		int c = leia.nextInt();
		
		int soma = a + b;
		
		System.out.println(a + " + " + b + " + " + soma);
		
		if (soma > c) {
			System.out.println(" > " + c);
			System.out.println("\nA soma de A + B é maior do que C");
		} else if (soma <c) {
			System.out.println(" > " + c);
			System.out.println("\nA soma de A + B é menor do que C");
			
		} else {

			System.out.println(" = " + c);
			System.out.println(" \nA soma de A + B é igual a C");
			
		}
		
		leia.close();

	}

}
