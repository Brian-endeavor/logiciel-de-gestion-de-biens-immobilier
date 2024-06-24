package gui;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ModifierInfosLocatairesGui {

	public JFrame frmModifierMesInformations;
	private JTextField textField;
	private JTextField textField2;
	private int iD;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { ModifierInfosLocatairesGui window =
	 * new ModifierInfosLocatairesGui (int iD);
	 * window.frmModifierMesInformations.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the application.
	 * @param iD 
	 */
	public ModifierInfosLocatairesGui(int iid) {
		iD=iid;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModifierMesInformations = new JFrame();
		frmModifierMesInformations.setTitle("Modifier mes informations personnelles");
		frmModifierMesInformations.getContentPane().setBackground(new Color(255, 128, 128));
		frmModifierMesInformations.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(239, 84, 86, 20);
		frmModifierMesInformations.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nouveau numéro de téléphone:");
		lblNewLabel.setBounds(30, 87, 195, 14);
		frmModifierMesInformations.getContentPane().add(lblNewLabel);
		
		textField2= new JTextField();
		textField2.setBounds(239, 105, 116, 20);
		frmModifierMesInformations.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel2 = new JLabel("Nouvelle adresse mail:");
		lblNewLabel2.setBounds(30, 108, 195, 14);
		frmModifierMesInformations.getContentPane().add(lblNewLabel2);
		
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!textField.getText().isEmpty()) {
				
				try {
					//Connection
				
					int cet_Id = iD;
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.esigelec.fr:1521:orcl", "C##BDD2_6", "BDD26");
					String query = "UPDATE locataire_lct SET lct_num_tel = ? WHERE lct_id = ?";
					PreparedStatement ps = conn.prepareStatement(query);
					ps.setInt(1, Integer.parseInt(textField.getText()));
					ps.setInt(2, cet_Id);
					int ru = ps.executeUpdate();
					if(ru>0) {
						
						//JOptionPane.Option.Dialog(new JFrame(), "Numéro de téléphone modifié avec succès. ", " ", JOptionPane.PLAIN_MESSAGE);
						 // Custom buttons
		                Object[] options = {"OK", "Consulter"};
		                int n = JOptionPane.showOptionDialog(new JFrame(),
		                    "Numéro de téléphone modifié avec succès.",
		                    " ",
		                    JOptionPane.YES_NO_OPTION,
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    options,
		                    options[0]);
		                
		               /* if (n == JOptionPane.YES_OPTION) {
		                    // OK button pressed
		                    System.out.println("OK pressed");*/
		             
					//}
					//else
						if (n == JOptionPane.NO_OPTION) {
							
//							public void actionPerformed(ActionEvent e) {
								try {
									//System.out.println(ID);
									ConsulterInfosLocataireGui window = new ConsulterInfosLocataireGui(iD);
									window.frmConsulterMesInformations.setVisible(true);
								} catch (Exception eb) {
									eb.printStackTrace();
								}
								
							}
		                    // Consulter button pressed
		                    //System.out.println("Consulter pressed");
		                    // Code to open the consultation window or perform any other action
		                    
		                }
					
					
					conn.close();
			} catch(Exception ee) {
				ee.printStackTrace();
				
				
				
			}
				
				}
				
				 if (!textField2.getText().isEmpty()) {
				try {
					//Connection
				
					int cet_Id = iD;
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.esigelec.fr:1521:orcl", "C##BDD2_6", "BDD26");
					String query = "UPDATE locataire_lct SET lct_mail = ? WHERE lct_id = ?";
					PreparedStatement ps = conn.prepareStatement(query);
					ps.setString(1, textField2.getText());
					ps.setInt(2, cet_Id);
					int ru = ps.executeUpdate();
					if(ru>0) {
						
						//JOptionPane.Option.Dialog(new JFrame(), "Numéro de téléphone modifié avec succès. ", " ", JOptionPane.PLAIN_MESSAGE);
						 // Custom buttons
		                Object[] options = {"OK", "Consulter"};
		                int n = JOptionPane.showOptionDialog(new JFrame(),
		                    "e-mail modifié avec succès.",
		                    " ",
		                    JOptionPane.YES_NO_OPTION,
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    options,
		                    options[0]);
		                
		               /* if (n == JOptionPane.YES_OPTION) {
		                    // OK button pressed
		                    System.out.println("OK pressed");*/
		             
					//}
					//else
						if (n == JOptionPane.NO_OPTION) {
							
//							public void actionPerformed(ActionEvent e) {
								try {
									//System.out.println(ID);
									ConsulterInfosLocataireGui window = new ConsulterInfosLocataireGui(iD);
									window.frmConsulterMesInformations.setVisible(true);
								} catch (Exception eb) {
									eb.printStackTrace();
								}
								
							}
		                    // Consulter button pressed
		                    //System.out.println("Consulter pressed");
		                    // Code to open the consultation window or perform any other action
		                    
		                }
					
					
					conn.close();
			} catch(Exception ee) {
				ee.printStackTrace();	
			}
				
		}}
			});
		btnNewButton.setBounds(87, 187, 89, 23);
		frmModifierMesInformations.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmModifierMesInformations.dispose();
			}
		});
		btnNewButton_1.setBounds(291, 187, 89, 23);
		frmModifierMesInformations.getContentPane().add(btnNewButton_1);
		frmModifierMesInformations.setBounds(100, 100, 450, 300);
		frmModifierMesInformations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
