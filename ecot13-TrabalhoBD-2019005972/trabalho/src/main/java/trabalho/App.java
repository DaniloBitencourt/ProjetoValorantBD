package trabalho;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("trabalho");
		EntityManager em = emf.createEntityManager();
		
		
		Arma a = new Arma();
		a.setNome("vandal");
		a.setDano(150);
		a.setQuantidadeBalas(24);
		
		Agente ag1 = new Agente();
		Agente ag2 = new Agente();
		Agente ag3 = new Agente();
		Agente ag4 = new Agente();
		Agente ag5 = new Agente();
		ag1.setNome("Raze");
		ag1.setClasse("Duelista");
		SemRecarga h = new SemRecarga();
		h.setQuantiaUtilizavel(1);
		h.setNome("Cartucho de tinta");
		ag1.getHabilidades().add(h);
		ag2.setNome("Sage");
		ag2.setClasse("Sentinela");
		RecargaTempo h2 = new RecargaTempo();
		h2.setTempoRecarga(30);
		h2.setNome("Orbe de Cura");
		ag2.getHabilidades().add(h2);
		ag3.setNome("Skye");
		ag3.setClasse("Iniciador");
		RecargaTempo h3 = new RecargaTempo();
		h3.setTempoRecarga(30);
		h3.setNome("Predador Explosivo");
		ag3.getHabilidades().add(h3);
		ag4.setNome("Viper");
		ag4.setClasse("Controlador");
		RecargaTempo h4 = new RecargaTempo();
		h4.setTempoRecarga(30);
		h4.setNome("Cortina toxica");
		ag4.getHabilidades().add(h4);
		ag5.setNome("Omen");
		ag5.setClasse("Controlador");
		RecargaTempo h5 = new RecargaTempo();
		h5.setTempoRecarga(30);
		h5.setNome("Manto sombrio");
		ag5.getHabilidades().add(h5);
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
		Jogador j5 = new Jogador();
		j1.setNome("Xand");
		j1.setAgente(ag1);
		j1.setArma(a);
		j1.setNacionalidade("brasileiro");
		j2.setNome("Jonn");
		j2.setAgente(ag2);
		j2.setArma(a);
		j2.setNacionalidade("brasileiro");
		j3.setNome("Caua");
		j3.setAgente(ag3);
		j3.setArma(a);
		j3.setNacionalidade("brasileiro");
		j4.setNome("Vixen");
		j4.setAgente(ag4);
		j4.setArma(a);
		j4.setNacionalidade("brasileiro");
		j5.setNome("bzn");
		j5.setAgente(ag5);
		j5.setArma(a);
		j5.setNacionalidade("brasileiro");
		Time t = new Time();
		t.setNome("Nip");
		t.getJogadores().add(j1);
		t.getJogadores().add(j2);
		t.getJogadores().add(j3);
		t.getJogadores().add(j4);
		t.getJogadores().add(j5);
		
		Jogador j6 = new Jogador();
		Jogador j7 = new Jogador();
		Jogador j8 = new Jogador();
		Jogador j9 = new Jogador();
		Jogador j10 = new Jogador();
		j6.setNome("Aspas");
		j6.setAgente(ag1);
		j6.setArma(a);
		j6.setNacionalidade("brasileiro");
		j7.setNome("Saadhack");
		j7.setAgente(ag2);
		j7.setArma(a);
		j7.setNacionalidade("argentino");
		j8.setNome("Sacy");
		j8.setAgente(ag3);
		j8.setArma(a);
		j8.setNacionalidade("brasileiro");
		j9.setNome("Less");
		j9.setAgente(ag4);
		j9.setArma(a);
		j9.setNacionalidade("brasileiro");
		j10.setNome("Pancada");
		j10.setAgente(ag5);
		j10.setArma(a);
		j10.setNacionalidade("brasileiro");
		Time t2 = new Time();
		t2.setNome("Loud");
		t2.getJogadores().add(j6);
		t2.getJogadores().add(j7);
		t2.getJogadores().add(j8);
		t2.getJogadores().add(j9);
		t2.getJogadores().add(j10);
		Partida p = new Partida(t,t2);
		p.setQuantidadeRodadas(28);
		p.setVencedor(t2);
		Mapa m = new Mapa();
		m.setNome("Ascent");
		m.setPartida(p);
		p.setMapa(m);
		MataMata c = new MataMata();
		c.setApresentador("Guilherme Spacca");
		c.setCanalTransmissao("VALORANT_BR");
		c.getPartidas().add(p);
		c.getTimes().add(t);
		c.getTimes().add(t2);
		c.setCampeao(t2);
		
		System.out.println("Os jogadores da equipe "+ t.getNome() +" sao:");
		System.out.println(j1.getNome() + ", " + j2.getNome() + ", " + j3.getNome() + ", " +j4.getNome()+ ", "+j5.getNome());
		System.out.println("Os jogadores da equipe "+ t2.getNome() +" sao:");
		System.out.println(j6.getNome() + ", " + j7.getNome() + ", " + j8.getNome() + ", " +j9.getNome()+ ", "+j10.getNome());
		System.out.println("Os agentes escolhidos por ambos os times foram: ");
		System.out.println(ag1.getNome() + ", " + ag2.getNome() + ", " + ag3.getNome() + ", " +ag4.getNome()+ ", "+ag5.getNome()+"\n");
		System.out.println("O campeonato foi apresentado por: " + c.getApresentador());
		System.out.println("A partida ocorreu no mapa: " + m.getNome());
		System.out.println("A partida durou " + p.getQuantidadeRodadas()+ " rodadas \n");
		System.out.println("O campeao do torneio foi o time: " + c.getCampeao().getNome());
		
		em.getTransaction().begin();
		
		em.persist(a);
		
		em.persist(ag1);
		em.persist(ag2);
		em.persist(ag3);
		em.persist(ag4);
		em.persist(ag5);
		
		em.persist(h);
		em.persist(h2);
		em.persist(h3);
		em.persist(h4);
		em.persist(h5);
		
		em.persist(j1);
		em.persist(j2);
		em.persist(j3);
		em.persist(j4);
		em.persist(j5);
		
		em.persist(t);
		

		em.persist(j6);
		em.persist(j7);
		em.persist(j8);
		em.persist(j9);
		em.persist(j10);
		
		em.persist(t2);

		em.persist(p);
		em.persist(m);
		em.persist(c);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
