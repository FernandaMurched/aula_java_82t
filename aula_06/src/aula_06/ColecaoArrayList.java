package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		numeros.add(2.3);
		numeros.add(4.2);
		numeros.add(6.0);
		numeros.add(7.9);
		numeros.add(3.1);
		
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		/* System.out.print("Digite um número real: ");
		double input = leia.nextDouble();
		
		numeros.add(input);
		
		for(var numero : numeros) {
			System.out.println(numero);
		} */
		
		System.out.println("\nÍndice do número 7.9: " + numeros.indexOf(7.9));
		
		System.out.println("\nO número 45.9 existe na coleção? " + numeros.contains(7.9));
		
		System.out.println("\nQual o valor está armazenado no índice 2? " + numeros.get(2));
		
		numeros.set(0, 89.0);
		System.out.println("\n-> numeros.set(0, 89.0); // Substitui o valor no índice 0");
		System.out.println("\nDados atualizados após substituição: ");
		numeros.forEach(System.out::println);   // Reference method -> Percorra todo o meu ArrayList como forEach e execute o println do System.out para cada elemento
		
		numeros.remove(2);
		System.out.println("\n-> numeros.remove(2); // Remove o valor no índice 2");
		System.out.println("\nDados atualizados após exclusão: ");
		numeros.forEach(System.out::println);
		
		numeros.remove(3.1);
		System.out.println("\n-> numeros.remove(3.1); // Remove o valor igual a 3.1 (primeira ocorrência)");
		System.out.println("\nDados atualizados após exclusão: ");
		numeros.forEach(System.out::println);
		
		numeros.sort(null);
		System.out.println("\n-> numeros.sort(null); // Ordena todos os valores em ordem crescente");
		System.out.println("\nDados atualizados após ordenação: ");
		numeros.forEach(System.out::println);

		
		System.out.println("\nTamanho atual da coleção: " + numeros.size());
		
		System.out.println("\n-> numeros.clear(); // Deleta os valores da Collection");
		numeros.clear();
		System.out.println("\nColeção está vazia após .clear()? " + numeros.isEmpty());

		
		leia.close();
	}

}
