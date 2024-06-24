package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfilBailleurGui {
    public int idd;
	public JFrame frmProfilDuBailleur;

	public ProfilBailleurGui(int id) {
		idd=id;
		initialize();
	}

	
	private void initialize() {
		frmProfilDuBailleur = new JFrame();
		frmProfilDuBailleur.setTitle("Profil  bailleur");
		frmProfilDuBailleur.getContentPane().setBackground(new Color(255, 128, 128));
		frmProfilDuBailleur.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Consulter mes informations personnelles");
		btnNewButton.setBounds(76, 35, 290, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//System.out.println(ID);
					ConsulterInfosbailleursGui window = new ConsulterInfosbailleursGui(idd);
					window.frmConsulterMesInformations.setVisible(true);
				} catch (Exception eb) {
					eb.printStackTrace();
				}
				
			}
		});
		
		frmProfilDuBailleur.getContentPane().add(btnNewButton);
		
		JButton btnConsulterMesBaux = new JButton("Consulter mes baux");
			btnConsulterMesBaux.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ConsulterBailbailleurGUI window = new ConsulterBailbailleurGUI(idd);
						window.frmBaillocataire.setVisible(true);
					} catch (Exception ea) {
						ea.printStackTrace();
					}
					
				}
			});
	
		btnConsulterMesBaux.setBounds(76, 199, 290, 33);
		frmProfilDuBailleur.getContentPane().add(btnConsulterMesBaux);
		
		JButton btnRetour = new JButton("retour");
		btnRetour.setBounds(76, 285, 290, 33);
		frmProfilDuBailleur.getContentPane().add(btnRetour);
		
		JButton btnModifierMesInformations= new JButton("Modifier mes informations personnelles");
		btnModifierMesInformations.setBounds(76, 117, 290, 33);
		btnModifierMesInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ModifierInfosLocatairesGui window = new ModifierInfosLocatairesGui(idd);
					window.frmModifierMesInformations.setVisible(true);
				} catch (Exception ea) {
					ea.printStackTrace();
				}
				
			}
		});
		
		frmProfilDuBailleur.getContentPane().add(btnModifierMesInformations);
		frmProfilDuBailleur.setBounds(100, 100, 450, 422);
		frmProfilDuBailleur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
