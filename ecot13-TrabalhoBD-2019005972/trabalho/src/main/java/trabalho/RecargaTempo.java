package trabalho;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class RecargaTempo extends Habilidade {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2298600092983654729L;
	private int tempoRecarga;

	public int getTempoRecarga() {
		return tempoRecarga;
	}

	public void setTempoRecarga(int tempoRecarga) {
		this.tempoRecarga = tempoRecarga;
	}
	
}
