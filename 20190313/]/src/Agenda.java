public class Agenda {
	private Contato[] contatos;
	private int quantidade;
	
	public Agenda(Contato[] contatos, int quantidade) {
		this.contatos = contatos;
		this.quantidade = quantidade;
	}

	public Agenda() {
		
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}