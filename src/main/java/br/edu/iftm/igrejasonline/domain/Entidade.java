package br.edu.iftm.igrejasonline.domain;

import java.io.Serializable;

public class Entidade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//tratar endereco
	public Integer id;
	public String nome;
	public String telefone;
		
	public Entidade(int i, String string, String string2) {
		
	}
	
	public Entidade(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entidade other = (Entidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
