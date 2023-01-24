package trabalho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Agente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 291255789699461969L;
	@Id
	private String nome;
	private String classe;
	@OneToMany
	private List<Habilidade> habilidade = new ArrayList<Habilidade>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public List<Habilidade> getHabilidades() {
		return habilidade;
	}
	public void setHabilidades(List<Habilidade> habilidade) {
		this.getHabilidades().add((Habilidade) habilidade);
	}
}
