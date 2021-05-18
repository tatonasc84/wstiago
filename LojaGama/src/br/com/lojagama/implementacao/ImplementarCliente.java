package br.com.lojagama.implementacao;

import br.com.lojagama.modelo.Cliente;
import br.com.lojagama.modelo.Endereco;
import br.com.lojagama.modelo.PessaJuridica;
import br.com.lojagama.modelo.PessoaFisica;
import util.Magic;

public class ImplementarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PessoaFisica pf = new PessoaFisica();
		Cliente cli = new Cliente();
		String nome = Magic.s("Nome: ");
		String email = Magic.s("Email: ");
		String fone = Magic.s("Fone: ");
		Endereco endereco = new Endereco();
		
		
		char resposta = Magic.s("Digite J para PJ ou F para PF").charAt(0);
		if (resposta=='J') {
			cli= new PessaJuridica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CPNPJ"),
					Magic.s("CNAE"),
					Magic.s("CONTATO")	
		);
			
		}else if (resposta=='F') {
			cli = new PessoaFisica(
					nome, 
					email, 
					fone, 
					endereco,
					Magic.s("CPF"),
					Magic.s("RG")
					);
		}else {
			System.out.println("Opcao invalida");
							
			}
		
		if (cli instanceof PessoaFisica) {
			System.out.println(((PessoaFisica) cli).getDocumentos());
		}
	
	//System.out.println(cli.toString());
	
	}
	

}
