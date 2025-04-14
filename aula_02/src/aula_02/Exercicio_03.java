package aula_02;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtra, desconto, salarioLiquido;
		
		System.out.println("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Horas Extra: ");
		horasExtra = leia.nextFloat();
		
		System.out.println("Desconto: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtra * 5) - desconto;
		
		System.out.printf("\nSALÁRIO LÍQUIDO = %.2f + %.2f + (%.2f * 5) - %.2f\n", salarioBruto, adicionalNoturno, horasExtra, desconto);

		System.out.printf("Salário Líquido: %.2f\n", salarioLiquido);
		
	}
	

}
