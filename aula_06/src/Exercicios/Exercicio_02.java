package Exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.print("Digite o número que você deseja encontrar: ");

		int numero = leia.nextInt();

		if (numeros.contains(numero)) {

		int posicao = numeros.indexOf(numero);

		System.out.println("\nO número " + numero + " está localizado na posição: " + posicao);

		} else {

		System.out.println("\nO número " + numero + " não foi encontrado!");

		}

		numeros.sort(null);

		System.out.println("\nExibe os dados ordenados em ordem crescente");

		numeros.forEach(System.out::println);

		// Ordenar a Coleção em ordem decrescente //

		numeros.sort(Comparator.reverseOrder());

		System.out.println("\nExibe os dados ordenados em ordem decrescente");

		numeros.forEach(System.out::println);

		leia.close();

	}

}