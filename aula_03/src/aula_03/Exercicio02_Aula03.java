package aula_03;

import java.util.Scanner;

public class Exercicio02_Aula03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		 System.out.print("Informe o Nome Completo do doador: ");
		 String nome = leia.nextLine();
		 
		 System.out.print("\nDigite a Idade do doador: ");
	     int idade = leia.nextInt();

	     System.out.print("\nInforme, é a sua primeira vez doando de sangue? ");
	     boolean primeiraDoacao = leia.nextBoolean();
		
	     boolean apto = false;
			        
	     if (idade >= 18 & idade <= 69) {
	    	 if (idade >= 60 & idade <= 69 & primeiraDoacao) {
	                apto = false;
	            } else {
	                apto = true;
	            }
	        }
		 
	     if (apto) {
	            System.out.println("\n" + nome + ", você está apt@ para doar sangue!");
	        } else {
	            System.out.println("\n" + nome + ", infelizmente você não está apt@ para doar sangue!");
	        }

	       leia.close();
	}

}
