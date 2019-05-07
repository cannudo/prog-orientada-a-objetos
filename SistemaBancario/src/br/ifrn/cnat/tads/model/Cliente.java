package br.ifrn.cnat.tads.model;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private double renda;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String endereco, double renda) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
}