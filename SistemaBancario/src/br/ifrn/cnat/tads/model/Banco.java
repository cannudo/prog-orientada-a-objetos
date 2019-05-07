package br.ifrn.cnat.tads.model;

public class Banco {
	private int numero;
	private String endereco;
	Agencia[] agencias;
	private int quantidade;

	public Banco() {
		quantidade = 0;
		agencias = new Agencia[1];
	}

	public Banco(int numero, String endereco) {
		quantidade = 0;
		agencias = new Agencia[1];
		this.numero = numero;
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Agencia[] getAgencias() {
		return agencias;
	}


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void inserirAgencia(Agencia agencia) {
		if (quantidade < agencias.length) {
			for (int i = 0; i < agencias.length; i++) {
				if (agencias[i] == null) {
					agencias[i] = agencia;
					quantidade++;
					break;
				}
			}
		} else {
			int posicaoImediata = agencias.length;
			Agencia[] arrayTemporario = new Agencia[quantidade * 2];
			for (int i = 0; i < agencias.length; i++) {
				arrayTemporario[i] = agencias[i];
			}
			agencias = arrayTemporario;
			agencias[posicaoImediata] = agencia;
			quantidade++;
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		retorno += " • Número: " + this.numero + "\n";
		retorno += " • Endereço: " + this.endereco + "\n";
		retorno += " • Quantidade de agências: " + this.quantidade + "\n";
		if (this.quantidade > 0) {
			for (int i = 0; i < agencias.length; i++) {
				if (agencias[i] != null) {
					retorno += "    • Agência #" + (i + 1) + ": " + agencias[i].getNumero() + "\n";
				}
			}
		}
		return retorno;
	}


}
