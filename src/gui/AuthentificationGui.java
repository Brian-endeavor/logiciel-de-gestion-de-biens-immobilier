package gui;

import java.awt.EventQueue;

import dao.AuthentificationDAO;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentListener;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AuthentificationGui {

	public JFrame frmAuthentification;
	public JTextField id;
	private JTextField motdepasse;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthentificationGui window = new AuthentificationGui();
					window.frmAuthentification.setVisible(true);
				} catch (Exception e)
				{e.printStackTrace();}
			}
		});
	}

	
	public AuthentificationGui() {

		initialize();
	}

	
	private void initialize() {
		frmAuthentification = new JFrame();
		frmAuthentification.getContentPane().setBackground(new Color(255, 128, 128));
		frmAuthentification.setTitle("Authentification");
		frmAuthentification.setBounds(100, 100, 463, 314);
		frmAuthentification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAuthentification.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("SGI");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 11, 162, 33);
		frmAuthentification.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Authentification");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(162, 42, 132, 14);
		frmAuthentification.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(56, 91, 46, 14);
		frmAuthentification.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(56, 131, 71, 14);
		frmAuthentification.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Se connecter");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int n = Integer.parseInt(id.getText());
				String m = motdepasse.getText();
				AuthentificationDAO ath = new AuthentificationDAO();

				int i = ath.verification(n, m);

				if (i == 0) {
					frmAuthentification.dispose();
					// si le mdp commence par ad, il affiche la page correspondant a un
					// administrateur de l'entreprise
					if (m.startsWith("blr")) {
						try {
							ProfilBailleurGui window = new ProfilBailleurGui(Integer.parseInt(id.getText()));
							window.frmProfilDuBailleur.setVisible(true);
						} catch (Exception e3) {
							e3.printStackTrace();
						}
					}

					if (m.startsWith("loc")) {
						try {
							ProfilLocataireGui window = new ProfilLocataireGui(Integer.parseInt(id.getText()));
							window.frmProfilDuLocataire.setVisible(true);
							//System.out.println(Integer.parseInt(id.getText()));
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					} /*
						 * else { try { InterfGeneraleGui window = new InterfGeneraleGui();
						 * window.frmMenuPrincipal.setVisible(true); } catch (Exception e1) {
						 * e1.printStackTrace(); }
						 * 
						 * }
						 */

				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Mot de passe ou Identifiant invalide. ", "Erreur",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(172, 167, 108, 33);
		frmAuthentification.getContentPane().add(btnNewButton);

		id = new JTextField();
		id.setBounds(172, 89, 108, 20);
		frmAuthentification.getContentPane().add(id);
		id.setColumns(10);

		motdepasse = new JTextField();
		motdepasse.setBounds(172, 129, 108, 20);
		frmAuthentification.getContentPane().add(motdepasse);
		motdepasse.setColumns(10);

	}

}
