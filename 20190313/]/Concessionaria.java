public class Concessionaria {
	private String nome;
	private Carro[] carros;
	private int quantidade;
	
	Concessionaria() {
		nome = "Fiat";
		quantidade = 0;
		carros = new Carro[1];
	}

	public Concessionaria(String nome, Carro[] carros, int quantidade) {
		super();
		this.nome = nome;
		this.carros = carros;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carro[] getCarros() {
		return carros;
	}

	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void addCarro(Carro novoCarro) {
		if(quantidade < carros.length) {
			for (int i = 0; i < carros.length; i++) {
				if (carros[i] == null) {
					carros[i] = novoCarro;
					quantidade++;
					break;
				}
			}
		} else {
			Carro novoArray[] = new Carro[quantidade * 2];
			for (int i = 0; i < carros.length; i++) {
				novoArray[i] = carros[i];
			}
			novoArray[carros.length] = novoCarro;
			carros = novoArray;
		}
	}
	
}