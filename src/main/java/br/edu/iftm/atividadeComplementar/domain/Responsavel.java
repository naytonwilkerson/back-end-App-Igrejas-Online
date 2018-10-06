package br.edu.iftm.atividadeComplementar.domain;

import java.io.Serializable;

public class Responsavel implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	private String cpf;
	private String email;
	private String cidade;
	private String telefone;
	private String bairro;
	private String nome;

	public Responsavel() {
		super();
	}

	public Responsavel(String cpf, String email, String cidade, String telefone, String bairro, String nome) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.cidade = cidade;
		this.telefone = telefone;
		this.bairro = bairro;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
