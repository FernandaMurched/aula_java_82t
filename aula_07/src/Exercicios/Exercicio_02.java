package Exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
	
		int opcao;
		
		do {
            System.out.println("\n************************************************");
            System.out.println("|	      MENU DE OPÇÕES:                  |");
            System.out.println("************************************************\n");
            System.out.println("	1: Adicionar título de um livro.");
            System.out.println("	2: Listar todos os livros na pilha");
            System.out.println("	3: Retirarlivro da pilha");
            System.out.println("	0: Sair");
            System.out.println("\n************************************************");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch(opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro);

                    System.out.println("\nPilha:");
                    for (String livro1: pilha) {
                        System.out.println(livro1);
                    }

                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    System.out.println("\nLista de livros na pilha:");
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        for (String livro1 : pilha) {
                            System.out.println(livro1);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        pilha.pop(); 
                        System.out.println("\nPilha atualizada:");
                        for (String livro1 : pilha) {
                            System.out.println(livro1);
                        }
                        System.out.println("\nO livro foi removido!");
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

