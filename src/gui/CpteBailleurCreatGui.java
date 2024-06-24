package gui;

import java.awt.EventQueue;
import model.Bailleur;
import dao.BailleurDAO;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CpteBailleurCreatGui {

	public JFrame frmCrationDunCompte;
	private JTextField id_bailleur;
	private JTextField nom_bailleur;
	private JTextField prenom_bailleur;
	private JTextField mail_bailleur;
	private JTextField num_bailleur;
	private JTextField adresse_bailleur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CpteBailleurCreatGui window = new CpteBailleurCreatGui();
					window.frmCrationDunCompte.setVisible(true);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CpteBailleurCreatGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrationDunCompte = new JFrame();
		frmCrationDunCompte.getContentPane().setBackground(new Color(255, 128, 128));
		frmCrationDunCompte.setTitle("Création d'un compte bailleur");
		frmCrationDunCompte.setBounds(100, 100, 450, 300);
		frmCrationDunCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrationDunCompte.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID du bailleur:");
		lblNewLabel.setBounds(47, 37, 89, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(47, 62, 89, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prénom(s):");
		lblNewLabel_2.setBounds(47, 87, 89, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adresse mail:");
		lblNewLabel_3.setBounds(47, 112, 89, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Numéro de téléphone:");
		lblNewLabel_4.setBounds(47, 137, 131, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Créer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id  = Integer.parseInt(id_bailleur.getText());
				String aNom = nom_bailleur.getText();
				String aPrenom = prenom_bailleur.getText();
				String aMail = mail_bailleur.getText();
				String aAdresse = adresse_bailleur.getText();
				String aNumTel = num_bailleur.getText();
				Bailleur blr1 = new Bailleur(id, aNom, aPrenom, aMail, aAdresse, aNumTel);	
				BailleurDAO blrDAO = new BailleurDAO();
				blrDAO.add(blr1);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(89, 202, 89, 23);
		frmCrationDunCompte.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(259, 202, 89, 23);
		frmCrationDunCompte.getContentPane().add(btnNewButton_1);
		
		id_bailleur = new JTextField();
		id_bailleur.setBounds(182, 34, 86, 20);
		frmCrationDunCompte.getContentPane().add(id_bailleur);
		id_bailleur.setColumns(10);
		
		nom_bailleur = new JTextField();
		nom_bailleur.setBounds(182, 59, 86, 20);
		frmCrationDunCompte.getContentPane().add(nom_bailleur);
		nom_bailleur.setColumns(10);
		
		prenom_bailleur = new JTextField();
		prenom_bailleur.setBounds(182, 84, 86, 20);
		frmCrationDunCompte.getContentPane().add(prenom_bailleur);
		prenom_bailleur.setColumns(10);
		
		mail_bailleur = new JTextField();
		mail_bailleur.setBounds(182, 109, 86, 20);
		frmCrationDunCompte.getContentPane().add(mail_bailleur);
		mail_bailleur.setColumns(10);
		
		num_bailleur = new JTextField();
		num_bailleur.setBounds(182, 134, 86, 20);
		frmCrationDunCompte.getContentPane().add(num_bailleur);
		num_bailleur.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse: ");
		lblNewLabel_5.setBounds(47, 166, 46, 14);
		frmCrationDunCompte.getContentPane().add(lblNewLabel_5);
		
		adresse_bailleur = new JTextField();
		adresse_bailleur.setBounds(182, 165, 86, 20);
		frmCrationDunCompte.getContentPane().add(adresse_bailleur);
		adresse_bailleur.setColumns(10);
	}
}
