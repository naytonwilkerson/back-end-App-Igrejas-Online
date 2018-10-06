package br.edu.iftm.atividadeComplementar.domain;

import java.io.Serializable;

public class Entidade implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	private String nome;
	private String bairro;
	private String cidade;
	private String telefone;
	private String Endereco;
	
	public Entidade() {
		super();
	}

	public Entidade(String nome, String bairro, String cidade, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;
		Endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	
}
