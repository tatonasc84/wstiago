package br.com.rubinhocar.teste;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		//1 instanciar um objeto
		Veiculo objeto = new Veiculo();
		
		//2º preencher modelo
		objeto.preencherModelo("camaro");
		objeto.preencherValor(20000);
		objeto.preencherMontadora("Wolksvagem");
		//3ºExibir os dados
		System.out.println(objeto.retornaModelo());
		System.out.println(objeto.retornaValor());
		System.out.println(objeto.retornaMontadora());
		
		
		
		

	}

}
