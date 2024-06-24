package gui;

import java.awt.EventQueue;
import model.Locataire;


import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import dao.LocataireDAO;

import java.awt.Font;
import java.awt.Color;

public class CpteLocataireCreatGui {

	public JFrame frmCrationDunCompte;
	private JTextField nom;
	private JTextField prenoms;
	private JTextField mail;
	private JTextField numtel;
	private JTextField id_locataire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CpteLocataireCreatGui window = new CpteLocataireCreatGui();
					window.frmCrationDunCompte.setVisible(true);
				} catch (Exception e4) {
					e4.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CpteLocataireCreatGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrationDunCompte = new JFrame();
		frmCrationDunCompte.getContentPane().setBackground(new Color(255, 128, 128));
		frmCrationDunCompte.setTitle("Création d'un compte locataire");
		frmCrationDunCompte.setBounds(100, 100, 450, 300);
		frmCrationDunCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrationDunCompte.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID du locataire: ");
		lblNewLabel.setBounds(41, 42, 85, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom:");
		lblNewLabel_1.setBounds(41, 67, 96, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prénom(s):");
		lblNewLabel_2.setBounds(41, 92, 96, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adresse mail:");
		lblNewLabel_3.setBounds(41, 117, 108, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Créer");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id  = Integer.parseInt(id_locataire.getText());
				String aNom = nom.getText();
				String aPrenom = prenoms.getText();
				String aMail = mail.getText();
				String aNumTel = numtel.getText();
				Locataire l1 = new Locataire(id, aNom, aPrenom,aMail, aNumTel);
				LocataireDAO locDAO = new LocataireDAO();
				locDAO.add(l1);	
			}
		});
		btnNewButton.setBounds(104, 195, 89, 23);
		frmCrationDunCompte.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrationDunCompte.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(263, 195, 89, 23);
		frmCrationDunCompte.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Numéro de téléphone:");
		lblNewLabel_4.setBounds(41, 142, 126, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_4);
		
		nom = new JTextField();
		nom.setBounds(177, 64, 86, 20);
		frmCrationDunCompte.getContentPane().add(nom);
		nom.setColumns(10);
		
		prenoms = new JTextField();
		prenoms.setBounds(177, 89, 86, 20);
		frmCrationDunCompte.getContentPane().add(prenoms);
		prenoms.setColumns(10);
		
		mail = new JTextField();
		mail.setBounds(177, 114, 86, 20);
		frmCrationDunCompte.getContentPane().add(mail);
		mail.setColumns(10);
		
		numtel = new JTextField();
		numtel.setBounds(177, 139, 86, 20);
		frmCrationDunCompte.getContentPane().add(numtel);
		numtel.setColumns(10);
		
		id_locataire = new JTextField();
		id_locataire.setBounds(177, 39, 86, 20);
		frmCrationDunCompte.getContentPane().add(id_locataire);
		id_locataire.setColumns(10);
	}

}
