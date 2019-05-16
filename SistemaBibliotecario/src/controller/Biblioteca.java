package controller;

import model.*;

public class Biblioteca {
	private String nomeFantasia;
	private String endereco;
	private Livro[] livros;
	private Usuario[] usuarios;
	private Reserva[] reservas;
	
	
	
	public Biblioteca() {
		livros = new Livro[1];
		usuarios = new Usuario[1];
		reservas = new Reserva[1];
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return String.format(" • Nome fantasia: %s\n • Endereço: %s", getNomeFantasia(), getEndereco());
	}
}
