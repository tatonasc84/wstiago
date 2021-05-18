package br.com.teste.excecao;

public class MinhaExcecao  extends Exception{

	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nullo";
			} else if (e instanceof NumberFormatException) {
				return "Numero invalido";
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				return "Vetor estourou";
			}else {
				return "Erro desconhecido, chame o o administrador";
			}
	
	}
}
