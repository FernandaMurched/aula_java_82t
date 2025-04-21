package Exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 // Matriz 3x3 //
		 int[][] matriz = new int [3][3];
		 
		 // Soma dos valores diagonais //
		 int somaPrincipal = 0, somaSecundaria = 0;
		 
		 System.out.println("\n==== Informe os números para preencher a matriz");
		 
		 // Laço de repetição da matriz //
		 for (int i = 0; i < 3; i++) { // Linha //
			 for (int j = 0; j < 3; j++) { // Coluna //
			 System.out.println("Elemento [" + i + "][" + j + "]: ");
			 matriz [i][j] = leia.nextInt();
		 }
	 }
		
		// 
		System.out.println("\n=== Elementos da diagonal principal ===");
		for (int i = 0; i < 3; i++) {
           System.out.print(matriz[i][i] + " ");
           somaPrincipal += matriz[i][i];
       }
	
		System.out.println("\n\n=== Elementos da diagonal secundária ===");
       for (int i = 0; i < 3; i++) {
           System.out.print(matriz[i][2 - i] + " ");
           somaSecundaria += matriz[i][2 - i];
		}
       
       System.out.println("\n\nSoma da Diagonal Principal: " + somaPrincipal);
       System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);

       leia.close();
	}
	
}
