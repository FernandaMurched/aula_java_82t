package aula_02;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.print("número1: ");
		n1 = leia.nextFloat();
		
		System.out.print("número2: ");
		n2 = leia.nextFloat();

		System.out.print("número3: ");
		n3 = leia.nextFloat();

		System.out.print("número4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nDiferença: %.1f\n", diferenca);
		 
	}

}
