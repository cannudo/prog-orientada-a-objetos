package esporte;
import aluno.Aluno;

public class Esporte {
	private String nome;
	private double mensalidade;
	Aluno[] alunos;
	private int quantidade;
	
	public Esporte() {
		alunos = new Aluno[1];
		quantidade = 0;
	}

	public Esporte(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
		alunos = new Aluno[1];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void inserirAluno(Aluno aluno) {
		if (quantidade < alunos.length) {
			for (int i = 0; i < alunos.length; i++) {
				if (alunos[i] == null) {
					alunos[i] = aluno;
					quantidade++;
					break;
				}
			}
		} else {
			int posicaoImediata = alunos.length;
			Aluno[] temporario = new Aluno[quantidade * 2];
			for (int j = 0; j < alunos.length; j++) {
				temporario[j] = alunos[j];
			}
			alunos = temporario;
			alunos[posicaoImediata] = aluno;
			quantidade++;
		}
	}
}