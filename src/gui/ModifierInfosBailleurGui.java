package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ModifierInfosBailleurGui {

	private JFrame frmModifierMesInformations;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierInfosBailleurGui window = new ModifierInfosBailleurGui();
					window.frmModifierMesInformations.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModifierInfosBailleurGui() {
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
		
		JLabel lblNewLabel = new JLabel("Nouveau numéro de téléphone:");
		lblNewLabel.setBounds(25, 39, 188, 28);
		frmModifierMesInformations.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nouvelle adresse:");
		lblNewLabel_1.setBounds(25, 130, 152, 14);
		frmModifierMesInformations.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(217, 43, 86, 20);
		frmModifierMesInformations.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 127, 86, 20);
		frmModifierMesInformations.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(88, 227, 89, 23);
		frmModifierMesInformations.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBounds(321, 227, 89, 23);
		frmModifierMesInformations.getContentPane().add(btnNewButton_1);
		frmModifierMesInformations.setBounds(100, 100, 468, 317);
		frmModifierMesInformations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
