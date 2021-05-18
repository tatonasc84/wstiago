package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 7000));
		lista.add(new Cargo("Dev", "JR", 4000));
		lista.add(new Cargo("Infra", "JR", 1000));
		lista.add(new Cargo("Redes", "JR", 10));

		System.out.println("Completa: " + lista);
		
		double total=0;
		double totalDBA=0;
		int qtdeJr=0;
		Cargo resposta = new Cargo ();
		for (Cargo objeto: lista) {
			System.out.println("Cargo: "+ objeto.getNome());
			System.out.println("Cargo: "+ objeto.getNivel());
			System.out.println("Cargo: "+ objeto.getSalario());
			System.out.println("==============================");
			total +=objeto.getSalario();
			if (objeto.getNome().equals("DBA")) {
				totalDBA += objeto.getSalario();
			}
			
			if (objeto.getNivel().equalsIgnoreCase("JR")) {
				qtdeJr ++;
			}
			if (objeto.getSalario()>resposta.getSalario()) {
				resposta = objeto;
			}
		}
		
		System.out.println("Total: " + total);
		System.out.println("Media: " + (total/lista.size()));
		System.out.println("Total DBA: " + totalDBA);
		System.out.println("Qtde JR: " + qtdeJr);
		System.out.println("Cargo com maior salario: " + resposta);
		
		
	}

}
