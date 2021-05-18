package br.com.bankofoz.beans;

import br.com.bankofoz.util.OperacoesBasicas;

public class Agencia  {
	
	private String nome;
	private int	numero;
	private String fone;
	
	
	
	
	
	
	
	public Agencia() {
		super();
	}





	public Agencia(String nome, int numero, String fone) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.fone = fone;
	}





	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", numero=" + numero + ", fone=" + fone + "]";
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

}
