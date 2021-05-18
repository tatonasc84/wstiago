package br.com.unixyz.modelo;

public class Professor {
	
	
	
	
	public Professor(String nome, String titulacao, double valor_hora, br.com.unixyz.modelo.Endereco endereco) {
		super();
		this.nome = nome;
		this.titulacao = titulacao;
		this.valor_hora = valor_hora;
		Endereco = endereco;
	}
	
	
	public Professor() {
		super();
	}


	private String nome;
	private String titulacao;
	private double valor_hora;
	private Endereco  Endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public double getValor_hora() {
		return valor_hora;
	}
	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	public Endereco getEndereco() {
		return Endereco;
	}
	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}


	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", titulacao=" + titulacao + ", valor_hora=" + valor_hora + ", Endereco="
				+ Endereco + "]";
	}
	
	
	
	
	

}
