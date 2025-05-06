package aula_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numerosDesordenados = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		List<Integer> numerosAoCubo = numeros.stream().map(n -> n * n * n).collect(Collectors.toList());

		System.out.println("\nNúmero elevados ao cubo: " + numerosAoCubo);
		System.out.println("\nColeção números: " + numeros);

		List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println("\nNúmeros pares: " + numerosPares);

		List<String> estadosIniciandoS = estados.stream().filter(e -> e.toString().toUpperCase().startsWith("S"))
				.collect(Collectors.toList());

		System.out.println("\nEstados que iniciam com a letra S: " + estadosIniciandoS);

		long contagemEstadosIniciandoS = estados.stream().filter(e -> e.toString().toUpperCase().startsWith("S"))
				.distinct().count();

		System.out.println("\nEstados que iniciam com a letra S: " + contagemEstadosIniciandoS);

		List<Integer> numerosOrdenados = numerosDesordenados.stream().sorted().collect(Collectors.toList());
		System.out.println("\nNúmerod ordenados: " + numerosOrdenados);

	}

}
