package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfilLocataireGui {

	public JFrame frmProfilDuLocataire;
    private int ID;
	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { ProfilLocataireGui window = new
	 * ProfilLocataireGui(); window.frmProfilDuLocataire.setVisible(true); } catch
	 * (Exception e) { e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the application.
	 */
	public ProfilLocataireGui(int id) {
		initialize();
		ID=id;	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProfilDuLocataire = new JFrame();
		frmProfilDuLocataire.setTitle("Profil locataire");
		frmProfilDuLocataire.getContentPane().setBackground(new Color(255, 128, 128));
		frmProfilDuLocataire.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Consulter mes informations personnelles");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//System.out.println(ID);
					ConsulterInfosLocataireGui window = new ConsulterInfosLocataireGui(ID);
					window.frmConsulterMesInformations.setVisible(true);
				} catch (Exception eb) {
					eb.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(77, 27, 277, 31);
		frmProfilDuLocataire.getContentPane().add(btnNewButton);
		
		JButton btnModifierMesInformations = new JButton("Modifier mes informations personnelles");
		btnModifierMesInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ModifierInfosLocatairesGui window = new ModifierInfosLocatairesGui(ID);
					window.frmModifierMesInformations.setVisible(true);
				} catch (Exception ea) {
					ea.printStackTrace();
				}
				
			}
		});
		btnModifierMesInformations.setBounds(77, 101, 277, 31);
		frmProfilDuLocataire.getContentPane().add(btnModifierMesInformations);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmProfilDuLocataire.dispose();
			}
		});
		btnRetour.setBounds(77, 251, 277, 31);
		frmProfilDuLocataire.getContentPane().add(btnRetour);
		
		JButton btnConsulterMesBaux = new JButton("Consulter mes baux");
		btnConsulterMesBaux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ConsulterBailLocataireGUI window = new ConsulterBailLocataireGUI(ID);
					window.frmBaillocataire.setVisible(true);
				} catch (Exception ea) {
					ea.printStackTrace();
				}
				
			}
		});
		
		
		btnConsulterMesBaux.setBounds(77, 175, 277, 31);
		frmProfilDuLocataire.getContentPane().add(btnConsulterMesBaux);
		frmProfilDuLocataire.setBounds(100, 100, 450, 382);
		frmProfilDuLocataire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfilDuLocataire.setVisible(true);
	}

}
