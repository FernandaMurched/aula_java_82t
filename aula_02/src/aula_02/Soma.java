package aula_02;

public class Soma {

	public static void main(String[] args) {
		
		int numero_01 = 2, numero_02 = 2;
		String numeros_01 = "2", numeros_02 = "2";
		
		System.out.printf("\nSoma: %d + %d = %d", numero_01, numero_02, (numero_01 + numero_02));
		System.out.printf("\nConcatenação: %s + %s = %s", numeros_01, numeros_02, (numero_01 + numeros_02));
		
		//Atribuição com soma
		System.out.println(numero_01 = numero_01 + 2);
		System.out.println(numero_02 += 2);
	}

}
