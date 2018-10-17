package br.edu.iftm.igrejasonline.domain;

import java.io.Serializable;

public class Igreja implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	private String cnpj;
	private String nome;
	private String cidade;
	private String bairro;
	private String telefone;
	private String endereco;

	public Igreja() {
		super();
	}

	public Igreja(String cnpj, String nome, String cidade, String bairro, String telefone, String endereco) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.cidade = cidade;
		this.bairro = bairro;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
