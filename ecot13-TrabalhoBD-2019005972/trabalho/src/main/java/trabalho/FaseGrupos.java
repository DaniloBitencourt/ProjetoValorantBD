package trabalho;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class FaseGrupos extends Campeonato {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1775222838777404348L;
	private int quantidadeGrupos;
	private int quantidadeClassificados;
	public int getQuantidadeGrupos() {
		return quantidadeGrupos;
	}
	public void setQuantidadeGrupos(int quantidadeGrupos) {
		this.quantidadeGrupos = quantidadeGrupos;
	}
	public int getQuantidadeClassificados() {
		return quantidadeClassificados;
	}
	public void setQuantidadeClassificados(int quantidadeClassificados) {
		this.quantidadeClassificados = quantidadeClassificados;
	}	
}
