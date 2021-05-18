package br.com.unixyz.modelo;

public class Curso {
	
	
	
	private String descricao;
	private String sigla;
	private String fone;
	private double valor;
	private String formacao;
	
	@Override
	public String toString() {
		return "Curso [descricao=" + descricao + ", sigla=" + sigla + ", fone=" + fone + ", valor=" + valor
				+ ", formacao=" + formacao + "]";
	}

	public Curso(String descricao, String sigla, String fone, double valor, String formacao) {
		super();
		this.descricao = descricao;
		this.sigla = sigla;
		this.fone = fone;
		this.valor = valor;
		this.formacao = formacao;
	}

	public Curso() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	
	
	
	
	

}
