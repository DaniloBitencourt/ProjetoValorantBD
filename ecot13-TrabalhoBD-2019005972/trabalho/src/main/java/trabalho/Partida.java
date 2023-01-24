package trabalho;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Partida implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1635275036915954742L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int quantidadeRodadas;
	@OneToOne
	private Time time1;
	@OneToOne
	private Time time2;
	@OneToOne
	private Time vencedor;
	private Mapa mapa;
	Partida(Time time1, Time time2){
		this.time1 = time1;
		this.time2 = time2;
	}
	public int getQuantidadeRodadas() {
		return quantidadeRodadas;
	}
	public void setQuantidadeRodadas(int quantidadeRodadas) {
		this.quantidadeRodadas = quantidadeRodadas;
	}
	public Time getTime1() {
		return time1;
	}
	public void setTime1(Time time1) {
		this.time1 = time1;
	}
	public Time getTime2() {
		return time2;
	}
	public void setTime2(Time time2) {
		this.time2 = time2;
	}
	public Time getVencedor() {
		return vencedor;
	}
	public void setVencedor(Time vencedor) {
		this.vencedor = vencedor;
	}
	public Mapa getMapa() {
		return mapa;
	}
	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
}
