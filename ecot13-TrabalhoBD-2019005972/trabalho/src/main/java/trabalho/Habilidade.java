package trabalho;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Habilidade implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2175270983774473446L;
	@Id
	private String nome;
	private int custo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
}
