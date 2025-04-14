package aula_02;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("\nDigite o valor do abono: ");
		float abono = leia.nextFloat();
		
		System.out.printf("\nSalário: %.2f, Abono: %.2f e Salário noevo é igual a: %.2f", salario, abono, (salario+abono));	
			
	}

}
