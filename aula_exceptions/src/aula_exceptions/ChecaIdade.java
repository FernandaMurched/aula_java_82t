package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		try {
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		}catch(ArithmeticException e) {
			System.out.println("Você não tem idade suficiente para digirir!");
		}
	}

	public static void validarIdade(int idade) {
		
		if(idade > 18)
			System.out.println("Você tem idade para dirigir!");
		else
			throw new ArithmeticException("Menor de idade!");
	}

}
