package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>(10);
		
		System.out.println("\nDigite dez números não repetidos: ");
		
		while (numeros.size() < 10) {
			System.out.println("Número " + (numeros.size() + 1) + ": ");
			int numero = leia.nextInt();
			
		if (!numeros.add(numero)) {
			System.out.println("Parece que o número é repetido. Tente novamente.");
			}
		
		}
		
		System.out.println("\nListar dados do Set:");
        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        leia.close();
	}

}
