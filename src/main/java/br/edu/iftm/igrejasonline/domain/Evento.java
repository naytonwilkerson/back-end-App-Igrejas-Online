package br.edu.iftm.igrejasonline.domain;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private String titulo;
	private Date hora;
	private String bairro;
	private Date dia;
	private String cidade;
	private String Endereco;
	private Date data;
	private String descricao;
	private String publico;

	public Evento() {
		super();
	}

	public Evento(Integer codigo, String titulo, Date hora, String bairro, Date dia, String cidade, String endereco,
			Date data, String descricao, String publico) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.hora = hora;
		this.bairro = bairro;
		this.dia = dia;
		this.cidade = cidade;
		this.Endereco = endereco;
		this.data = data;
		this.descricao = descricao;
		this.publico = publico;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

}
