package aula_03;

import java.util.Scanner;

public class Exercicio04_Aula03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do produto: ");
		int opcao = leia.nextInt();
		
		System.out.println("Quantidade: ");
		int quantidade = leia.nextInt();
		
		String produto = "";
		double precoUnitario = 0.0;
		
		switch (opcao) {
		
		case 1:
			produto = "Hot Dog";
			precoUnitario = 10.00;
			break; // Finaliza apenas o laço
			
		case 2:
			produto = " X-Saladers";
			precoUnitario = 15.00;
			break;
			
		case 3:
            produto = "X-Bacon";
            precoUnitario = 18.00;
            break;
            
        case 4:
            produto = "Mrs. Bauru";
            precoUnitario = 12.00;
            break;
            
        case 5:
            produto = "Refrigereco";
            precoUnitario = 8.00;
            break;
            
        case 6:
            produto = "Suco de orange";
            precoUnitario = 13.00;
            break; 
            
            default: 
            	System.out.println("Código não identificado!");
            	leia.close();
    			return; // Utilizado para sair do programa
		}
		
    	double valorTotal = quantidade * precoUnitario;
    	
    	System.out.println("\nProduto: " + produto);
    	
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
        
        leia.close();
	}

}
