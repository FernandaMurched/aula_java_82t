package aula_03;

import java.util.Scanner;

public class Exercício06_Aula03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float numero_01 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		float numero_02 = leia.nextFloat();
		
		System.out.println("\nInforme a operação que deseja realizar: ");
		
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		
		System.out.print("Digite o código da operação (1 a 4): ");
        int opcao = leia.nextInt();
		
        switch (opcao) {
        	case 1:
        		System.out.printf("\n%.2f + %f = %.2f", numero_01, numero_02, numero_01 + numero_02);
        		break;
        		
        	case 2:
        		System.out.printf("\n%.2f + %f = %.2f", numero_01, numero_02, numero_01 - numero_02);
        		break;
        		
        	case 3:
        		System.out.printf("\n%.2f + %f = %.2f", numero_01, numero_02, numero_01 * numero_02);
        		break;
        		
        	case 4:
        		System.out.printf("\n%.2f + %f = %.2f", numero_01, numero_02, numero_01 / numero_02);
        		break;
        	default:
        		System.out.println("\nOperação inválida!");
        }
        leia.close();
	}

}
