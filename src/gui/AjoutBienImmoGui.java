package gui;

import java.awt.EventQueue;
import model.BienImmobilier;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.JTextField;

import dao.BiensImmobiliersDAO;


import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjoutBienImmoGui {

	public JFrame frmAjoutDunBien;
	private JTextField id_du_bien_immobilier;
	private JTextField ville;
	private JTextField codePostal;
	private JTextField nomRue;
	private JTextField nbreChambres;
	private JTextField superficie;
	private JTextField superficieBalcon;
	private JTextField superficieCour;
	private JTextField superficieJardin;
	private JTextField superficieTerasse;
	private JTextField anneeConstruction;
	private JTextField numRue;
	private JTextField type;
	private JTextField typeChauffage;
	private JTextField typeRue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutBienImmoGui window = new AjoutBienImmoGui();
					window.frmAjoutDunBien.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjoutBienImmoGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAjoutDunBien = new JFrame();
		frmAjoutDunBien.getContentPane().setBackground(new Color(255, 128, 128));
		frmAjoutDunBien.setTitle("Ajout d'un bien immobilier");
		frmAjoutDunBien.setBounds(100, 100, 454, 756);
		frmAjoutDunBien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjoutDunBien.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID du bien immobilier:");
		lblNewLabel.setBounds(20, 30, 154, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ville:");
		lblNewLabel_1.setBounds(20, 55, 105, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Code postal:");
		lblNewLabel_2.setBounds(20, 80, 117, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de la rue: ");
		lblNewLabel_3.setBounds(20, 105, 133, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre de chambres:");
		lblNewLabel_4.setBounds(20, 130, 133, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Superficie:");
		lblNewLabel_5.setBounds(20, 155, 105, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Meublé:");
		lblNewLabel_6.setBounds(20, 180, 89, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Balcon: ");
		lblNewLabel_7.setBounds(20, 211, 89, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_7);
		
		JCheckBox oui = new JCheckBox("");
		oui.setBackground(new Color(255, 128, 128));
		oui.setBounds(166, 176, 34, 23);
		frmAjoutDunBien.getContentPane().add(oui);
		
		JCheckBox oui3 = new JCheckBox("");
		oui3.setBackground(new Color(255, 128, 128));
		oui3.setBounds(166, 282, 97, 23);
		frmAjoutDunBien.getContentPane().add(oui3);
		
		JCheckBox oui2 = new JCheckBox("");
		oui2.setBackground(new Color(255, 128, 128));
		oui2.setBounds(166, 247, 54, 23);
		frmAjoutDunBien.getContentPane().add(oui2);
		
		JCheckBox oui1 = new JCheckBox("");
		oui1.setBackground(new Color(255, 128, 128));
		oui1.setBounds(166, 207, 34, 23);
		frmAjoutDunBien.getContentPane().add(oui1);
		
		JCheckBox oui5 = new JCheckBox("");
		oui5.setBackground(new Color(255, 128, 128));
		oui5.setBounds(166, 354, 21, 23);
		frmAjoutDunBien.getContentPane().add(oui5);
		
		JCheckBox oui4 = new JCheckBox("");
		oui4.setBackground(new Color(255, 128, 128));
		oui4.setBounds(166, 317, 21, 23);
		frmAjoutDunBien.getContentPane().add(oui4);
		
		
		JButton btnNewButton = new JButton("Créer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(id_du_bien_immobilier.getText());
				int aNbreChambres = Integer.parseInt(nbreChambres.getText());
				int aNumRue = Integer.parseInt(numRue.getText());
				int aAnneeConstruction = Integer.parseInt(anneeConstruction.getText());
				int aCodePostal = Integer.parseInt(codePostal.getText());
				String aTypeRue = typeRue.getText();
				String aVille = ville.getText();
				String aNomRue = nomRue.getText();
				String aType = type.getText();
				String aTypeChauffage = typeChauffage.getText();
				Double aSuperficie = Double.parseDouble(superficie.getText());
				Double aSuperficieCour = Double.parseDouble(superficieCour.getText());
				Double aSuperficieJardin = Double.parseDouble(superficieJardin.getText());
				Double aSuperficieTerasse = Double.parseDouble(superficieTerasse.getText());
				Double aSuperficieBalcon = Double.parseDouble(superficieBalcon.getText());
				boolean aOui = oui.isSelected();
				boolean aOui1 = oui1.isSelected();
				boolean aOui2 = oui2.isSelected();
				boolean aOui3 = oui3.isSelected();
				boolean aOui4 = oui4.isSelected();
				boolean aOui5 = oui5.isSelected();
				BienImmobilier b1 = new BienImmobilier(id, aNbreChambres, aCodePostal, aNumRue, aAnneeConstruction, aVille, aNomRue, aTypeRue,  aType, aTypeChauffage, aSuperficie, aSuperficieJardin, aSuperficieBalcon, aSuperficieTerasse, aSuperficieCour, aOui, aOui1, aOui2, aOui3, aOui4, aOui5);
				BiensImmobiliersDAO biDAO = new BiensImmobiliersDAO();
				biDAO.add(b1);
				

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(121, 693, 89, 14);
		frmAjoutDunBien.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAjoutDunBien.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(302, 693, 89, 14);
		frmAjoutDunBien.getContentPane().add(btnNewButton_1);
		
		id_du_bien_immobilier = new JTextField();
		id_du_bien_immobilier.setBounds(214, 27, 86, 20);
		frmAjoutDunBien.getContentPane().add(id_du_bien_immobilier);
		id_du_bien_immobilier.setColumns(10);
		
		ville = new JTextField();
		ville.setBounds(214, 52, 86, 20);
		frmAjoutDunBien.getContentPane().add(ville);
		ville.setColumns(10);
		
		codePostal = new JTextField();
		codePostal.setBounds(214, 77, 86, 20);
		frmAjoutDunBien.getContentPane().add(codePostal);
		codePostal.setColumns(10);
		
		nomRue = new JTextField();
		nomRue.setBounds(214, 102, 86, 20);
		frmAjoutDunBien.getContentPane().add(nomRue);
		nomRue.setColumns(10);
		
		nbreChambres = new JTextField();
		nbreChambres.setBounds(214, 127, 86, 20);
		frmAjoutDunBien.getContentPane().add(nbreChambres);
		nbreChambres.setColumns(10);
		
		superficie = new JTextField();
		superficie.setBounds(214, 152, 86, 20);
		frmAjoutDunBien.getContentPane().add(superficie);
		superficie.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Oui");
		lblNewLabel_8.setBounds(146, 180, 21, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Oui");
		lblNewLabel_10.setBounds(146, 211, 22, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("Cour:");
		lblNewLabel_12.setBounds(20, 251, 46, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Jardin:");
		lblNewLabel_13.setBounds(20, 286, 46, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Cave:");
		lblNewLabel_14.setBounds(20, 321, 46, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Terasse:");
		lblNewLabel_15.setBounds(20, 354, 62, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Oui");
		lblNewLabel_16.setBounds(146, 286, 21, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_18 = new JLabel("Oui");
		lblNewLabel_18.setBounds(146, 321, 21, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_20 = new JLabel("Oui");
		lblNewLabel_20.setBounds(146, 354, 21, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_20);
		
		
		JLabel lblNewLabel_22 = new JLabel("Oui");
		lblNewLabel_22.setBounds(146, 251, 21, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_22);
		
		
		
		JLabel lblNewLabel_24 = new JLabel("Superficie balcon:");
		lblNewLabel_24.setBounds(20, 399, 167, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Superficie Cour:");
		lblNewLabel_25.setBounds(20, 435, 133, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Superficie jardin:");
		lblNewLabel_26.setBounds(20, 468, 105, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Superficie terasse:");
		lblNewLabel_27.setBounds(20, 508, 105, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_27);
		
		superficieBalcon = new JTextField();
		superficieBalcon.setBounds(214, 396, 86, 20);
		frmAjoutDunBien.getContentPane().add(superficieBalcon);
		superficieBalcon.setColumns(10);
		
		superficieCour = new JTextField();
		superficieCour.setBounds(214, 432, 86, 20);
		frmAjoutDunBien.getContentPane().add(superficieCour);
		superficieCour.setColumns(10);
		
		superficieJardin = new JTextField();
		superficieJardin.setBounds(214, 465, 86, 20);
		frmAjoutDunBien.getContentPane().add(superficieJardin);
		superficieJardin.setColumns(10);
		
		superficieTerasse = new JTextField();
		superficieTerasse.setBounds(214, 505, 86, 20);
		frmAjoutDunBien.getContentPane().add(superficieTerasse);
		superficieTerasse.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Année Construction:");
		lblNewLabel_28.setBounds(20, 541, 117, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Numéro de Rue:");
		lblNewLabel_29.setBounds(20, 573, 105, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_29);
		
		anneeConstruction = new JTextField();
		anneeConstruction.setBounds(214, 536, 86, 20);
		frmAjoutDunBien.getContentPane().add(anneeConstruction);
		anneeConstruction.setColumns(10);
		
		numRue = new JTextField();
		numRue.setBounds(214, 570, 86, 20);
		frmAjoutDunBien.getContentPane().add(numRue);
		numRue.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("Type:");
		lblNewLabel_30.setBounds(20, 609, 46, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Type Chauffage:");
		lblNewLabel_31.setBounds(20, 634, 133, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_31);
		
		type = new JTextField();
		type.setBounds(214, 601, 86, 20);
		frmAjoutDunBien.getContentPane().add(type);
		type.setColumns(10);
		
		typeChauffage = new JTextField();
		typeChauffage.setBounds(214, 631, 86, 20);
		frmAjoutDunBien.getContentPane().add(typeChauffage);
		typeChauffage.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Type Rue:");
		lblNewLabel_9.setBounds(20, 659, 74, 14);
		frmAjoutDunBien.getContentPane().add(lblNewLabel_9);
		
		typeRue = new JTextField();
		typeRue.setBounds(214, 664, 86, 20);
		frmAjoutDunBien.getContentPane().add(typeRue);
		typeRue.setColumns(10);
	}
}
