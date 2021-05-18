package br.com.lojagama.modelo;

public class PessaJuridica extends Cliente {
	
	public String getDocumentos() {
		return cnpj + ";" + cnae;
	}
	
	
	@Override
	public String toString() {
		return "PessaJuridica [cnpj=" + cnpj + ", cnae=" + cnae + ", contato=" + contato + ", toString()="
				+ super.toString() + "]";
	}
	public PessaJuridica() {
		super();
	}

	
	public PessaJuridica(String nome, String email, String fone, Endereco endereco, String cnpj, String cnae,
			String contato) {
		super(nome, email, fone, endereco);
		this.cnpj = cnpj;
		this.cnae = cnae;
		this.contato = contato;
	}


	private String cnpj;
	private String cnae;
	private String contato;
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	
	

}
