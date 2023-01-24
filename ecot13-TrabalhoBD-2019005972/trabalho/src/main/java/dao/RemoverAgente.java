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

public class RemoverAgente extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5424789807606966118L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textClasse;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("trabalho");
	private EntityManager em = emf.createEntityManager();
	private Agente agente = new Agente();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverAgente frame = new RemoverAgente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public RemoverAgente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		JLabel lblNewLabel_1 = new JLabel("Classe");
		JLabel lblNewLabel_5 = new JLabel("Remoção de Agente");
		
		lblNewLabel_5.setBounds(30,5,200,14);
		lblNewLabel.setBounds(30, 45, 86, 14);
		lblNewLabel_1.setBounds(30,85,86,14);
		textNome = new JTextField();
		textNome.setBounds(143, 40, 86, 20);
		textNome.setColumns(10);
		
		textClasse = new JTextField();
		textClasse.setEnabled(false);
		textClasse.setBounds(143, 80, 86, 20);
		textClasse.setColumns(10);
		
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_5);
		contentPane.add(textNome);
		contentPane.add(textClasse);
		
		final JButton btnRemover = new JButton("Remover");
		btnRemover.setEnabled(false);
		btnRemover.setBounds(307, 150, 89, 23);
		contentPane.add(btnRemover);
		
		final JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agente = em.find(Agente.class, textNome.getText());
				
				if(agente != null) {
					textClasse.setText(agente.getClasse());
					btnNewButton.setEnabled(false);
					btnRemover.setEnabled(true);
					textNome.setEnabled(false);
					textClasse.setEnabled(true);
				}else {
					textNome.setText("Erro");
					textClasse.setText("Erro");
					textNome.setText("");
				}
				
			}
		});
		btnNewButton.setBounds(307, 110, 89, 23);
		contentPane.add(btnNewButton);
		
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textNome.setText("");
				textNome.setEnabled(true);
				textClasse.setText("");
				textClasse.setEnabled(false);
				
				
				btnNewButton.setEnabled(true);
				btnRemover.setEnabled(false);
				
				em.getTransaction().begin();
				em.remove(agente);
				em.getTransaction().commit();
			}
		});
	}
	
}
