
public class Agenda {

	private Contato [] contatos;
	private int qtd;

	public Agenda(){
		qtd = 0;
		contatos = new Contato[5];
	}

	public Contato[] getContatos(){
		return contatos;
	}

	public void inserirContato(Contato novoContato){
		if(qtd < contatos.length){
			for (int i = 0; i < contatos.length; i++) {
				if(contatos[i] == null){
					contatos[i] = novoContato;
					qtd++;
					break;
				}
			}
		}else{
			Contato novoArray[] = new Contato[qtd*2];
			for (int i = 0; i < contatos.length; i++) {
				novoArray[i] = contatos[i];
			}
			contatos = novoArray;
		}
	}

	public boolean removerContato(String nome){
		for (int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null){
				if(contatos[i].getNome().equalsIgnoreCase(nome)){
					contatos[i] = null;
					qtd--;
					return true;
				}
			}
		}
		return false;
	}
	
	public Contato buscarContato(String nome){
		for (int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null){
				if(contatos[i].getNome().equalsIgnoreCase(nome)){
					return contatos[i];
				}
			}
		}
		return null;
	}

	public int getQuantidade(){
		return qtd;
	}


}
