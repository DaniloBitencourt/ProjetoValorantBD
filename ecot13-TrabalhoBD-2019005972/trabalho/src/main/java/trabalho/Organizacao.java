package trabalho;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Organizacao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3883677454281855823L;
	@Id
	private String nome;
	@OneToOne
	private Time time;
	@OneToOne
	private Streamer streamer;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Streamer getStreamer() {
		return streamer;
	}
	public void setStreamer(Streamer streamer) {
		this.streamer = streamer;
	}
	
}
