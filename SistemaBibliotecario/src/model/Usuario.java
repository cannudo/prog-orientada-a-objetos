package model;

public class Usuario {
	private String matricula;
	private String nome;
	private String telefone;
	private String email;
	private String curso;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	
	
}