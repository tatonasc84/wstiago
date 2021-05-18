package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> lista = new HashSet<String>();
		lista.add("Dev");
		lista.add("Analista");
		lista.add("Gerente de Projetos");
		lista.add("DBA");
		lista.add("DBA");
		System.out.println("Completa: " + lista);
	
		
		//par aset o ideal é o foreach
		for (String cargo: lista) {
			System.out.println("cargo: " + cargo);
		}
	}

}
