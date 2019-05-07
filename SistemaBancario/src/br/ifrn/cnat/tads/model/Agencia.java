package br.ifrn.cnat.tads.model;

public class Agencia {
	private int numero;
	private String endereco;
	Cliente[] clientes;
	ContaBancaria[] contas;
	private int quantidade;
	
	public Agencia() {
		clientes = new Cliente[1];
		contas = new ContaBancaria[1];
		quantidade = 0;
	}

	public Agencia(int numero, String endereco) {
		this.numero = numero;
		this.endereco = endereco;
		clientes = new Cliente[1];
		contas = new ContaBancaria[1];
		quantidade = 0;
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

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public ContaBancaria[] getContas() {
		return contas;
	}

	public void setContas(ContaBancaria[] contas) {
		this.contas = contas;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		String retorno = "";
		retorno += " • Número: " + this.numero + "\n";
		retorno += " • Endereço: " + this.endereco + "\n";
		retorno += " • Quantidade de clientes: " + this.quantidade + "\n";
		if (this.quantidade > 0) {
			for (int i = 0; i < clientes.length; i++) {
				if (clientes[i] != null) {
					retorno += "         • Cliente #" + (i + 1) + ": " + clientes[i].getNome() + "\n";
				}
			}
		}
		return retorno;
	}
}