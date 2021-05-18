package br.com.rubinhocar.modelo;

public class Veiculo {

	private float valor;
	private String  modelo;
	private String montadora;


	public String retornaModelo() {
		return modelo;		
	}

	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}

	public void preencherValor(float param) {
		valor =param;
	}

	public float retornaValor() {
		return	valor;
	}
	
	public void preencherMontadora(String param) {
		montadora = param.toLowerCase();
	}
	public String retornaMontadora() {
		return	montadora;
	}
	public void retornaTudo (float pValor, String pMontadora, String pModelo) {
	valor=pValor;
	modelo=pModelo;
	montadora = pMontadora;
	}
	
	public String retornaTudo() {
		return "modelo :" + modelo + "/n" + "Montadora: " + montadora + "/n" + "Valor: " + valor; 
	}
	
}
