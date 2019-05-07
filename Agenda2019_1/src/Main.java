import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = -1;
		Agenda agenda = new Agenda();
		String nomeContato;
		boolean resultado;
		Contato contato;
		
		while(opcao != 0){
			System.out.println("=======AGENDA DE CONTATOS======");
			System.out.println("0 - Sair;");
			System.out.println("1 - Inserir Contato;");
			System.out.println("2 - Buscar  Contato;");
			System.out.println("3 - Remover Contato;");
			System.out.println("4 - Listar Contatos;");
			System.out.println("5 - Adicionar Telefone a um Contato;\n\n");

			System.out.print("Digite a opção escolhida: ");
			opcao = sc.nextInt();	
			sc = new Scanner(System.in);

			switch (opcao) {
			case 1:
				System.out.println("DIGITE OS DADOS DO CONTATO...");
				System.out.print("Nome do Contato:");
				String nome = sc.nextLine();
				System.out.print("Endereço do Contato:");
				sc = new Scanner(System.in);
				String endereco = sc.nextLine();
				sc = new Scanner(System.in);
				Telefone phone = new Telefone();
				System.out.print("Tipo do Telefone do Contato:");
				phone.setTipo(sc.nextLine());
				System.out.print("Número do Telefone do Contato:");
				phone.setNumero(sc.nextLine());
				Contato novoContato = new Contato(nome, endereco);
				novoContato.inserirTelefone(phone);
				agenda.inserirContato(novoContato);
				System.out.println("CONTATO INSERIDO COM SUCESSO");
				break;
			case 2:
				System.out.print("Nome do Contato:");
				nomeContato = sc.nextLine();
				contato = agenda.buscarContato(nomeContato);				
				if(contato != null){
					System.out.println("Os dados do contato são:");
					System.out.println("nome: " + contato.getNome());
					System.out.println("endereço: " + contato.getEndereco());
					//System.out.println("telefone casa: " + contato.getTelefoneCasa());
					
				}else{
					System.out.println("CONTATO INEXISTENTE");
				}
				System.out.println("-----------");
				break;
			case 3:
				System.out.print("Nome do Contato:");
				nomeContato = sc.nextLine();
				resultado = agenda.removerContato(nomeContato);
				if(resultado)
					System.out.println("CONTATO REMOVIDO COM SUCESSO");
				else
					System.out.println("CONTATO INEXISTENTE");
				break;
			case 4:
				Contato array[] = agenda.getContatos();
				System.out.println("======LISTA DE CONTATOS======");
				System.out.println("A Agenda tem " + agenda.getQuantidade() + " Contatos.");
				for (int i = 0; i < array.length; i++) {
					if(array[i] != null){
						System.out.println("Contato #"+ (i+1));
						System.out.println("nome: " + array[i].getNome());
						System.out.println("endereço: " + array[i].getEndereco());
						Telefone telefonesDoContato [] = array[i].getTelefones();
						for (int j = 0; j < telefonesDoContato.length; j++) {
							if(telefonesDoContato[j] != null){								
								System.out.println("tipo telefone: " + telefonesDoContato[j].getTipo());
								System.out.println("número telefone: " + telefonesDoContato[j].getNumero());
							}
						}
						System.out.println("-----------");
					}
				}
				break;
			case 5:
				System.out.println("....adicionar telefone a contato...");
				break;

			}

		}
		System.out.println("==============================");
		System.out.println("=======Sistema Encerrado======");
		System.out.println("==============================");

	}

}
