package br.ifrn.cnat.tads.model;

public class ContaBancaria {
	private int numero;
	private double saldo;
	private double limite;
	Cliente cliente;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(int numero, double saldo, double limite, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
