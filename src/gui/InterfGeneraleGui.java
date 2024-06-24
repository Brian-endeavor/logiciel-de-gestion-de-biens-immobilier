package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.Color;

public class InterfGeneraleGui {

	public JFrame frmMenuPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfGeneraleGui window = new InterfGeneraleGui();
					window.frmMenuPrincipal.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfGeneraleGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuPrincipal = new JFrame();
		frmMenuPrincipal.getContentPane().setBackground(new Color(255, 128, 128));
		frmMenuPrincipal.setTitle("Menu Principal");
		frmMenuPrincipal.setBounds(100, 100, 577, 360);
		frmMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuPrincipal.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Biens immobiliers");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(54, 66, 138, 38);
		frmMenuPrincipal.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bailleurs");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(256, 78, 61, 14);
		frmMenuPrincipal.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Locataires");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(408, 83, 72, 14);
		frmMenuPrincipal.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ajouter un bien immobilier");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AjoutBienImmoGui window = new AjoutBienImmoGui();
					window.frmAjoutDunBien.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}	
			}
		});
		btnNewButton.setBounds(31, 234, 161, 23);
		frmMenuPrincipal.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ajouter un bailleur");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					CpteBailleurCreatGui window = new CpteBailleurCreatGui();
					window.frmCrationDunCompte.setVisible(true);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(217, 234, 139, 23);
		frmMenuPrincipal.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ajouter un locataire");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					CpteLocataireCreatGui window = new CpteLocataireCreatGui();
					window.frmCrationDunCompte.setVisible(true);
				} catch (Exception e4) {
					e4.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.setBounds(376, 234, 139, 23);
		frmMenuPrincipal.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Consulter les biens immobiliers");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ConsulterBienImmobilierGUI window = new ConsulterBienImmobilierGUI();
					window.frmConsulterLesBiens.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.setBounds(25, 136, 176, 23);
		frmMenuPrincipal.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Consulter les bailleurs");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.setBounds(217, 136, 139, 23);
		frmMenuPrincipal.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Consulter les locataires");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(376, 136, 139, 23);
		frmMenuPrincipal.getContentPane().add(btnNewButton_5);
	}
}
