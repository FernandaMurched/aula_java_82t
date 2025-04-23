package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class colecaoSet {

	public static void main(String[] args) {
		
colecaoSet<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
		System.out.println(fruta.hashCode());
			
		}
		
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		// Excluir elemento da coleção
		frutas.remove("Morango");
		
		// Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// Listei os dados após a exclusão de um elemento (Morango)
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
			
			
		}
		
		// Criamos a Coleção ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		// Adicionamos todos os elementos da Coleção Set (frutas) na Coleção ArrayList (frutasList)
		frutasList.addAll(frutas);
		
		// Ordenamos frutasList em ordem crescente
		frutasList.sort(null);
		
		//Exibimos frutaList em ordem crescente
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);
		
	}
 
}
 
