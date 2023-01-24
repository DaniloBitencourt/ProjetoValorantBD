package trabalho;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Empresa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4704583299469749851L;
	@Id
	private String nome;
	@OneToOne
	private Campeonato campeonato;
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
