package trabalho;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class MataMata extends Campeonato {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2665226559770301602L;
	private int quantidadeFases;
	private Time campeao;
	public int getQuantidadeFases() {
		return quantidadeFases;
	}
	public void setQuantidadeFases(int quantidadeFases) {
		this.quantidadeFases = quantidadeFases;
	}
	public Time getCampeao() {
		return campeao;
	}
	public void setCampeao(Time campeao) {
		this.campeao = campeao;
	}
	
}
