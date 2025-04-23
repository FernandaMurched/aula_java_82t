package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Banana");
		frutas.add("Maçã");      // Ignora o valor
		frutas.add("maçã");      // Aceita o valor, pois o hashcode é diferente para m minúsculo e m maiúsculo

		System.out.println("Frutas: " + frutas + "\n");
		
		for(var fruta : frutas) {
			System.out.println("HashCode da "+ fruta +": " + fruta.hashCode());
		}
		
		System.out.println("\nMorango existe na coleção? " + frutas.contains("Morango"));
		
		System.out.println("\nfrutas.remove(\"Morango\"); // Remove o item \"Morango\" da coleção");
		frutas.remove("Morango");
		System.out.println(frutas);
				
		// Criar um Iterator (outra forma de criar um loop para exibir as informações de um conjunto de dados
		Iterator<String> iFrutas = frutas.iterator();
		System.out.println("\nExibe os valores de frutas com o Iterator: ");

		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		// Transforma o Set em um ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		System.out.println("\nExibe o ArrayList de frutas e ordena: ");
		frutasList.addAll(frutas);
		frutasList.sort(null);
		frutasList.forEach(System.out::println);
		
	}

}