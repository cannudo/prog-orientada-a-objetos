package aluno;
public class Aluno {
	private String nome;
	private String matricula;
	private String email;
	private String nascimento;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String matricula, String email, String nascimento) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", nascimento=" + nascimento
				+ "]";
	}
}