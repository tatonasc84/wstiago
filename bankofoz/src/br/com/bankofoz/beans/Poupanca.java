package br.com.bankofoz.beans;

public class Poupanca extends Conta{
	
	private double rendimento;
	private String aniversario =  new String();
	
	
	public String getDiaAniversario() {
		if (aniversario.length()>2) {
			return aniversario.substring(0,2);
		}
		return "Aniversario invalido";
		
		
	}
	
	public void creditarRendimetnos() {
		super.setSaldo(super.getSaldo()+rendimento);
	}
	
	
	
	
	public Poupanca(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super(numero, saldo, cliente, agencia);
	}




	public Poupanca(int numero, double saldo, Cliente cliente, Agencia agencia, double rendimento, String aniversario) {
		super(numero, saldo, cliente, agencia);
		this.rendimento = rendimento;
		this.aniversario = aniversario;
	}




	public Poupanca() {
		super();
	}




	public Poupanca(double rendimento, String aniversario) {
		super();
		this.rendimento = rendimento;
		this.aniversario = aniversario;
	}




	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", aniversario=" + aniversario + "]";
	}
	
	
	
	
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	
	
	
	

}
