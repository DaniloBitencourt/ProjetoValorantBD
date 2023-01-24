package trabalho;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class SemRecarga extends Habilidade {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8757771644969954536L;
	private int quantiaUtilizavel;
	public int getQuantiaUtilizavel() {
		return quantiaUtilizavel;
	}

	public void setQuantiaUtilizavel(int quantiaUtilizavel) {
		this.quantiaUtilizavel = quantiaUtilizavel;
	}
	
}
