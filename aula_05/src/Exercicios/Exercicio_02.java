package Exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		// Vetor para inserir dz números //
		int[] vetor = new int [10];
		int soma = 0;
		
		System.out.println("\n===== Informe dez números inteiros =====");
		
		// Laço para os núemros  do vetor//
		for (int i = 0; i < vetor.length; i++) {
		System.out.println("Número " + (i + 1) + ": ");
		vetor [i] = leia.nextInt();
			
		}
		
		// Elementos impares no vetor //
		System.out.println("\n===== Elemento nos índices ímpares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) { 
				System.out.println(vetor[i] + " ");
			}
		}
		
		// Elementos pares no vetor //
		System.out.println("\n===== Elementos pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " ");
            }
        }
        
        // Soma dos números do vetor //
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        // Resultado da média // 
        float media = (float) soma / 10;

        System.out.println("\n+----------------------+");
        System.out.println("| Soma: " + soma + "             |");
        System.out.println("+----------------------+");

        System.out.println("+----------------------+");
        System.out.println("| Média: " + media + "           |");
        System.out.println("+----------------------+");

        
        leia.close();

 	}

}
