package br.com.bankofoz.beans;

import br.com.bankofoz.util.OperacoesBasicas;

public class Cliente implements OperacoesBasicas {

	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;
	
	
	
public String getUsusario () {
	if (email.contains("@")){
		return email.substring(0,email.indexOf("@"));
			}
	return email;
	
}
	
	
	
	
	public Cliente() {
		super();
	}


	public Cliente(String nome, String email, String fone, Endereco endereco, int id) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + ", id=" + id + "]";
	}
	
	
	
	
	
	private int id;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
