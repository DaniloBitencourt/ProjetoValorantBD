package trabalho;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Streamer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3955318987202239956L;
	@Id
	private String nome;
	@OneToOne
	private Organizacao organizacao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	
}
