package aula_04.exercícios;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = leia.nextInt();
				
		System.out.println("Informe o segundo número: ");
		int numero2 = leia.nextInt();
				
		if (numero1 >= numero2) {
			System.out.println("iiih, o intervalo é inválido! ");
		
		} else {
			
			System.out.println("No Intervalo entre " + numero1 + " e " + numero2);
			
			for (int i = numero1; i <= numero2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }}
			
			leia.close();
		}
		
	}

}
