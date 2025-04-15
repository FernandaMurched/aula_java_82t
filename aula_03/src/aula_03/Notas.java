package aula_03;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		float nota = leia.nextFloat();
		
		if (nota >= 7) {
			System.out.println("Aluno aprovado!");
			
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Aluno de recuperação!");
			
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		
		leia.close();		
	}

}
