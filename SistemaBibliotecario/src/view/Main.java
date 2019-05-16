package view;
import java.util.Scanner;

import controller.Biblioteca;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Para ter acesso aos métodos de uma biblioteca, é preciso cadastrá-la primeiro.");
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("Qual será o nome fantasia da biblioteca?");
		biblioteca.setNomeFantasia(leitor.nextLine());
		System.out.printf("Qual será o endereço da biblioteca %s?\n", biblioteca.getNomeFantasia());
		biblioteca.setEndereco(leitor.nextLine());
		System.out.println("Biblioteca cadastrada com sucesso!");
		
		int entrada = -1;
		while (entrada != 0) {
			System.out.println("\nO que deseja fazer a seguir?");
			System.out.println("0. Sair");
			System.out.println("1. Ver dados da biblioteca");
			System.out.print("Digite um inteiro correspondente a opção --> ");
			entrada = leitor.nextInt();
			leitor.nextLine();
			switch (entrada) {
			case 1:
				System.out.println("\n" + biblioteca.toString());
				break;
			}
		}
		System.out.println("Sessão encerrada.");
	}
}