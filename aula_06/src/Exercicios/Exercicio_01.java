package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite cinco cores diferentes: ");

		for (int i = 1; i <= 5; i++) {

		System.out.println("Cor " + i + ": ");

		String cor = leia.nextLine();

		cores.add(cor);

		}

		System.out.println("\nListar todas as cores:");

		for (String cor : cores) {

		System.out.println(cor);

		}

		Collections.sort(cores);

		System.out.println("\nOrdenar as cores:");

		for (String cor : cores) {

		System.out.println(cor);

		}

		leia.close();
		
	}
}