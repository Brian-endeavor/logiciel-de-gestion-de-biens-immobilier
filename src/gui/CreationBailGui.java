package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class CreationBailGui {

	private JFrame frmCrationDunBail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationBailGui window = new CreationBailGui();
					window.frmCrationDunBail.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreationBailGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrationDunBail = new JFrame();
		frmCrationDunBail.setTitle("Création d'un bail");
		frmCrationDunBail.getContentPane().setBackground(new Color(255, 128, 128));
		frmCrationDunBail.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID du bien immobilier:");
		lblNewLabel.setBounds(38, 11, 144, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Raison sociale :");
		lblNewLabel_1.setBounds(38, 55, 111, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type : ");
		lblNewLabel_2.setBounds(38, 103, 46, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date de prise d'effet : ");
		lblNewLabel_3.setBounds(36, 146, 134, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Durée : ");
		lblNewLabel_3_1.setBounds(38, 196, 89, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Date d'échéance du loyer : ");
		lblNewLabel_3_1_1.setBounds(38, 237, 158, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Fréquence de révisions : ");
		lblNewLabel_4.setBounds(38, 287, 144, 14);
		frmCrationDunBail.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_2 = new JLabel("Présence d'un garant : ");
		lblNewLabel_4_2.setBounds(38, 330, 144, 20);
		frmCrationDunBail.getContentPane().add(lblNewLabel_4_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Oui");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setBounds(188, 329, 46, 23);
		frmCrationDunBail.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Créer");
		btnNewButton.setBounds(85, 426, 89, 23);
		frmCrationDunBail.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBounds(311, 426, 89, 23);
		frmCrationDunBail.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(192, 8, 86, 20);
		frmCrationDunBail.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 52, 86, 20);
		frmCrationDunBail.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 100, 86, 20);
		frmCrationDunBail.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(192, 143, 86, 20);
		frmCrationDunBail.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(192, 193, 86, 20);
		frmCrationDunBail.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(188, 234, 86, 20);
		frmCrationDunBail.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(188, 284, 86, 20);
		frmCrationDunBail.getContentPane().add(textField_6);
		frmCrationDunBail.setBounds(100, 100, 485, 528);
		frmCrationDunBail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
