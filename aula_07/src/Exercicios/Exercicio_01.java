package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<String>();
		
		int opcao;
		
		do {
            System.out.println("\n************************************************");
            System.out.println("|	      MENU DE OPÇÕES:                  |");
            System.out.println("************************************************\n");
            System.out.println("	1: Adicionar novo cliente.");
            System.out.println("	2: Listar todos os clientes na fila");
            System.out.println("	3: Chamar uma pessoa da fila");
            System.out.println("	0: Finalizar o programa");
            System.out.println("\n************************************************");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch(opcao) {
                case 1:
                    System.out.print("\nDigite o nome do cliente: ");
                    String nome = leia.nextLine();
                    filaClientes.add(nome);

                    System.out.println("\nFila:");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }

                    System.out.println("\nCliente Adicionado!");
                    break;

                case 2:
                    System.out.println("\nLista de Clientes na Fila:");
                    if (filaClientes.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        filaClientes.poll(); 
                        System.out.println("\nFila atualizada:");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        } while (opcao != 0);

        leia.close();
    }
}