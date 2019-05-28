package controller;

import java.util.ArrayList;

import model.*;

public class Biblioteca {
	private String nomeFantasia;
	private String endereco;
	private Livro[] livros;
	private ArrayList<Usuario> usuarios;
	private Reserva[] reservas;
	
	
	
	public Biblioteca() {
		usuarios = new ArrayList<Usuario>();
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

	public void adicionarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	@Override
	public String toString() {
		return String.format(" • Nome fantasia: %s\n • Endereço: %s", getNomeFantasia(), getEndereco());
	}
}
