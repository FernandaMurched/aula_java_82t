package aula_03;

import java.util.Scanner;

public class Exercicio03_Aula03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do colaborador: ");
		
		String nome = leia.nextLine();
		
		System.out.println("Informe o código do cargo: ");
		int codigo = leia.nextInt();
		
		System.out.println("Informe o valor do salário: ");
		float salario = leia.nextFloat();
		
		String cargo = "";
		float percentualReajuste = 0;
		
		switch (codigo) {
		
        case 1:
            cargo = "Gerente";
            percentualReajuste = 0.10f;
            break;
            
        case 2:
            cargo = "Vendedor";
            percentualReajuste = 0.07f;
            break;
            
        case 3:
            cargo = "Supervisor";
            percentualReajuste = 0.09f;
            break; 
            
        default:
        	
            System.out.println("O código informado é inválido!");
            leia.close();
            return;
		}
		
		float novoSalario = salario + (salario * percentualReajuste);
		
		System.out.println("\nNome do Colaborador: " + nome);
		
        System.out.println("\nCargo: " + cargo);
        
        System.out.printf("\nNovo Salário: R$ %.2f\n", novoSalario);

        leia.close();
		
	}

}
