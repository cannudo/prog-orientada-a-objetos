package model;

public class Reserva {
	private Usuario usuario;
	private Livro livro;
	private boolean renovado;
	
	public Reserva(Usuario usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public boolean isRenovado() {
		return renovado;
	}

	public void setRenovado(boolean renovado) {
		this.renovado = renovado;
	}
	
}
