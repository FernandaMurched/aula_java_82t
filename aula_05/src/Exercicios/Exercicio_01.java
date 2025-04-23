package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Vetor com 10 números inteiros (não ordenados e não repetidos) //
		int[] vetor = {2, 5, 3, 1, 4, 9, 7, 8, 10, 6};
			System.out.println("=== Digite o número que deseja: ===");
		
		int numero = leia.nextInt();
		
		// Verifica se o número foi encontrado //
		boolean encontrado = false;
		
		for (int i = 0; i < vetor.length; i ++) {
			if (vetor[i] == numero) {
				System.out.println("\n✅ O número " + numero + " encontra-se na posição " + i + "!");
				encontrado = true;
				break;
			}
		}
		// Resultado final //
		if(!encontrado) {
			System.out.println("\n⚠️ Poxa vida... O número informado" + " não foi encontrado." + " Por favor, tente outra vez!");
		}
		
		leia.close();
	}

}
