package academia;
import esporte.Esporte;

public class Academia {
	private String nome;
	private String endereco;
	private Esporte[] esportes;
	private int quantidade;

	public Academia() {
		esportes = new Esporte[1];
		quantidade = 0;
	}

	public Academia(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		esportes = new Esporte[1];
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

	public Esporte[] getEsportes() {
		return esportes;
	}

	public void setEsportes(Esporte[] esportes) {
		this.esportes = esportes;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void inserirEsporte(Esporte esporte) {
		if (quantidade < esportes.length) {
			for (int i = 0; i < esportes.length; i++) {
				if (esportes[i] == null) {
					esportes[i] = esporte;
					quantidade++;
					break;
				}
			}
		} else {
			int posicaoImediata = esportes.length;
			Esporte[] temporario = new Esporte[quantidade * 2];
			for (int j = 0; j < esportes.length; j++) {
				temporario[j] = esportes[j];
			}
			esportes = temporario;
			esportes[posicaoImediata] = esporte;
			quantidade++;
		}
	}
}