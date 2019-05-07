import java.util.Scanner;
import academia.Academia;
import aluno.Aluno;
import esporte.Esporte;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Academia academia = new Academia("Miolos Malhados", "Rua do Código-Macarrão");
		int quantidade, opcao = -1;
		String nome, busca;

		while (opcao != 0) {
			System.out.println("O que você deseja fazer a seguir? Digite um inteiro correspondente a opção.\n");
			System.out.println("0. Sair");
			System.out.println("1. Cadastrar esporte");
			System.out.println("2. Cadastrar alunos em esporte");
			System.out.println("3. Listar esportes e alunos de uma academia");
			System.out.println("4. Verificar faturamento da academia");
			System.out.print("--> ");

			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("\nA acadêmia " + academia.getNome() + " agradece a preferência pelo sistema de Gestão \"Em Casa, Rodou!\". Não deixe de visitar nossa sede em " + academia.getEndereco() + ".");
				break;
			case 1:
				System.out.println("\nVocê escolheu cadastrar um esporte.\n");
				System.out.println("Digite o nome do esporte:");
				nome = input.nextLine();
				System.out.println("Digite a mensalidade do esporte:");
				double mensalidade = input.nextDouble();
				Esporte esporte = new Esporte(nome, mensalidade);
				academia.inserirEsporte(esporte);
				System.out.println("Esporte inserido com sucesso.\n");
				break;
			case 2:
				quantidade = academia.getQuantidade();
				if (quantidade > 0) {
					System.out.println("\nHá " + quantidade + " esporte(s) cadastrado(s) na acadêmia.\n");
					Esporte[] lista = academia.getEsportes();
					for (int i = 0; i < lista.length; i++) {
						if (lista[i] != null) {
							System.out.println("• Esporte #" + (i + 1) + ": " + lista[i].getNome());
							System.out.println("    • Mensalidade: " + lista[i].getMensalidade());
							System.out.println("    • Alunos: " + lista[i].getQuantidade());
						}
					}
					System.out.println("\nEm qual esporte você deseja cadastrar o aluno? Digite o nome do esporte");
					System.out.print("--> ");
					busca = input.nextLine();
					for (int i = 0; i < lista.length; i++) {
						if (lista[i] != null) {
							if (lista[i].getNome().toUpperCase().equals(busca.toUpperCase())) {
								System.out.println("\nVocê escolheu cadastrar um aluno em " + lista[i].getNome() + "\n");
								System.out.println("Digite o nome do aluno:");
								nome = input.nextLine();
								System.out.println("Digite a matrícula do aluno:");
								String matricula = input.nextLine();
								System.out.println("Digite o e-mail do aluno:");
								String email = input.nextLine();
								System.out.println("Digite a data de nascimento do aluno:");
								String nascimento = input.nextLine();
								Aluno aluno = new Aluno(nome, matricula, email, nascimento);
								lista[i].inserirAluno(aluno);
								System.out.println("\nAluno cadastrado com sucesso.\n");
							}
						} else {
							System.out.println("\nEsporte não cadastrado.\n");
						}
					}
				} else {
					System.out.println("\nNão há esportes cadastrados.\n");
				}
				break;
			case 3:
				quantidade = academia.getQuantidade();
				if (quantidade == 0) {
					System.out.println("\nNão há esportes cadastrados.\n");
				} else {
					System.out.println();
					Esporte[] lista = academia.getEsportes();
					for (int i = 0; i < lista.length; i++) {
						if (lista[i] != null) {
							System.out.println("• Esporte #" + (i + 1) + ": " + lista[i].getNome());
							System.out.println("    • Mensalidade: " + lista[i].getMensalidade());
							System.out.println("    • Alunos: " + lista[i].getQuantidade());
							Aluno[] listaDeAlunos = lista[i].getAlunos();
							for (int j = 0; j < listaDeAlunos.length; j++) {
								if (listaDeAlunos[j] != null) {
									System.out.println("        • Aluno #" + (j + 1) + ":" + listaDeAlunos[j].getNome());
									System.out.println("            • Matrícula: " + listaDeAlunos[j].getMatricula());
									System.out.println("            • Nascimento: " + listaDeAlunos[j].getNascimento());
									System.out.println("            • E-mail: " + listaDeAlunos[j].getEmail());
								}
							}
						}
					}
					System.out.println();
				}
				break;
			case 4:
				System.out.println("\nVocê escolheu verificar o faturamento da acadêmia.\n");
				if (academia.getQuantidade() == 0) {
					System.out.println("\nA academia ainda não está em funcionamento por falta de esportes.\n");
				} else {
					double faturamento = 0;
					Esporte[] lista = academia.getEsportes();
					for (int i = 0; i < lista.length; i++) {
						if (lista[i] != null) {
							quantidade = lista[i].getQuantidade();
							faturamento =  quantidade * (faturamento + lista[i].getMensalidade());
						}
					}
					System.out.println("O faturamento da academia é de R$ " + faturamento + "\n");
				}
				break;
			default:
				System.out.println("\nOpção inválida.\n");
				break;
			}
		}
	}
}