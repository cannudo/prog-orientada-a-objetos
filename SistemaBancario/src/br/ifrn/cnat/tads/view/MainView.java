package br.ifrn.cnat.tads.view;
import br.ifrn.cnat.tads.model.*;
import java.util.Scanner;

public class MainView {

	public static void main(String[] args) {
		int numero, quantidade;
		boolean ehigual = false;
		boolean achou = false;
		String endereco, busca;
		Scanner input = new Scanner(System.in);
		System.out.println("Para ter acesso ao sistema bancário, você deve primeiro criar um banco.");
		System.out.print("Digite o código do banco (numero inteiro): ");
		numero = input.nextInt();
		input.nextLine();
		System.out.print("Digite o endereço do banco: ");
		endereco = input.nextLine();
		Banco banco = new Banco(numero, endereco);
		System.out.println("Banco cadastrado com sucesso!");
		
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("\nO que deseja fazer a seguir? Digite um valor inteiro que corresponda à opção.");
			System.out.println("0. Encerrar sessão");
			System.out.println("1. Visualizar informações sobre o banco");
			System.out.println("2. Cadastrar uma agência");
			System.out.println("3. Visualizar informações sobre uma agência");
			System.out.print("--> ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Você escolheu encerrar a sessão.\n");
				System.out.println("Sessão encerrada.");
				break;
			case 1:
				System.out.println("Você escolheu vizualizar informações sobre o banco.\n");
				System.out.println(banco.toString());
				break;
			case 2:
				System.out.println("Você escolheu cadastrar uma agência.\n");
				System.out.print("Digite um valor inteiro para ser o número da agência: ");
				numero = input.nextInt();
				input.nextLine();
				quantidade = banco.getQuantidade();
				if (quantidade > 0) {
					Agencia[] agencias = banco.getAgencias();
					for (int i = 0; i < agencias.length; i++) {
						if (agencias[i] != null) {
							if (agencias[i].getNumero() == numero) {
								ehigual = true;
								break;
							}
						}
					}
				}
				if (ehigual) {
					System.out.println("Já existe uma agência com esse número.\n");
					ehigual = false;
				} else {
					System.out.print("Digite o endereço da agência: ");
					endereco = input.nextLine();
					Agencia agencia = new Agencia(numero, endereco);
					banco.inserirAgencia(agencia);
					System.out.println("Agência cadastrada com sucesso.\n");
					break;
				}
			case 3:
				System.out.println("Você escolheu visualizar informações de uma agência.\n");
				if (banco.getQuantidade() > 0) {
					Agencia[] agencias = banco.getAgencias();
					System.out.print("Digite o número da agência: ");
					numero = input.nextInt();
					for (int i = 0; i < agencias.length; i++) {
						if ((agencias[i] != null) && (agencias[i].getNumero() == numero)) {
							System.out.println(" • Agência " + agencias[i].getNumero() + ": ");
							System.out.println("         • Endereço: " + agencias[i].getEndereco());
							System.out.println("         • Quantidade de clientes: " + agencias[i].getQuantidade());
							achou = true;
							break;
						} else {
							achou = false;
						}
					}
					if (achou == false) {
						System.out.println("Agência não encontrada. Para encontrar o número da agência, digite 1 no menu principal.");
					}
				} else {
					System.out.println("Não há agências cadastradas.\n");
				}
				break;
			default:
				System.out.println("\nOpção inválida.");
				break;
			}
		}
	}
}