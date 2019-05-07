
public class Contato {
	
	private String nome;
	private String endereco;
	
	private Telefone telefones[];
	private int qtdTelefones;
	
	public Contato() {		
		// TODO Auto-generated constructor stub
	}
	
	public Contato(String nome, String endereco) {		
		this.nome = nome;
		this.endereco = endereco;
		telefones = new Telefone[5];
		qtdTelefones = 0;
	}
	
	public void inserirTelefone(Telefone novoTelefone){
		if(qtdTelefones < telefones.length){
			for (int i = 0; i < telefones.length; i++) {
				if(telefones[i] == null){
					telefones[i] = novoTelefone;
					qtdTelefones++;
					break;
				}
			}
		}else{
			Telefone novoArray[] = new Telefone[qtdTelefones*2];
			for (int i = 0; i < telefones.length; i++) {
				novoArray[i] = telefones[i];
			}
			telefones = novoArray;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public Telefone[] getTelefones(){
		return telefones;
	}
	
}
