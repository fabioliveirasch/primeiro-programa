package entities;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumero () {
		return numero;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public double getSaldo () {
		return saldo;		
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ numero 
				+ ", Titular: " 
				+ nome 
				+ ", Saldo: "
				+ String.format("%.2f", saldo);
	}
	
	
		
}
