package trabalho;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Mapa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1880904407893025737L;
	@Id
	private String nome;
	private String regioes;
	@OneToOne
	private Partida partida;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegioes() {
		return regioes;
	}
	public void setRegioes(String regioes) {
		this.regioes = regioes;
	}
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
}
