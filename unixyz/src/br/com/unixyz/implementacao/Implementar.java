package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class Implementar {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setBasico("Tiago", 1234);
		aluno.setCpf ("1234569789");
		aluno.setEmail("tatonacs#gmail.com");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Itaquera");
		endereco.setCep("08290-190");
		endereco.setCidade("Sao paulo");
		endereco.setComplemento(" ");
		endereco.setEstado("Sao Paulo");
		endereco.setLogradouro("Rua 10");
		endereco.setNumero("456");
		
		aluno.setEndereco(endereco);
		System.out.println(aluno.toString());
		
		
	}

}
