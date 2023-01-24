package trabalho;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Arma implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5236059190373749426L;
	@Id
	private String nome;
	private int dano;
	private int quantidadeBalas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getQuantidadeBalas() {
		return quantidadeBalas;
	}
	public void setQuantidadeBalas(int quantidadeBalas) {
		this.quantidadeBalas = quantidadeBalas;
	}
}
