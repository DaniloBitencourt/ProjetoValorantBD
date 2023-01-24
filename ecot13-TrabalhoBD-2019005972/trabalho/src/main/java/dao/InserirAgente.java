package dao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabalho.Agente;

import javax.swing.JTextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InserirAgente extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4098587429890657262L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textClasse;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("trabalho");
	private EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirAgente frame = new InserirAgente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public InserirAgente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		JLabel lblNewLabel_1 = new JLabel("Classe");
		JLabel lblNewLabel_5 = new JLabel("Inserção de Agente");
		
		lblNewLabel_5.setBounds(30,5,200,14);
		lblNewLabel.setBounds(30, 45, 86, 14);
		lblNewLabel_1.setBounds(30,85,86,14);
		textNome = new JTextField();
		textNome.setBounds(143, 40, 86, 20);
		textNome.setColumns(10);
		
		textClasse = new JTextField();
		textClasse.setBounds(143, 80, 86, 20);
		textClasse.setColumns(10);
		
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_5);
		contentPane.add(textNome);
		contentPane.add(textClasse);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agente agente = new Agente();
				agente.setNome(textNome.getText());
				agente.setClasse(textClasse.getText());
				textNome.setText("");
				textClasse.setText("");
				
				em.getTransaction().begin();
				em.persist(agente);
				em.getTransaction().commit();
			}
		});
		btnNewButton.setBounds(307, 110, 89, 23);
		contentPane.add(btnNewButton);
	}
	
}
