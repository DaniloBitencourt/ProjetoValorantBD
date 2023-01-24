package trabalho;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity

public abstract class Campeonato implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -335318819657702163L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String apresentador;
	private String canalTransmissao;
	@OneToMany
	private List<Time> times = new ArrayList<Time>();
	@OneToMany
	private List<Partida> partidas = new ArrayList<Partida>();
	@OneToOne
	private Empresa empresa;
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	public String getCanalTransmissao() {
		return canalTransmissao;
	}
	public void setCanalTransmissao(String canalTransmissao) {
		this.canalTransmissao = canalTransmissao;
	}
	public List<Time> getTimes() {
		return times;
	}
	public void setTimes(List<Time> times) {
		this.times = times;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
}
