package gui;
import java.sql.*;
import dao.BiensImmobiliersDAO;
import java.awt.EventQueue;
import model.BienImmobilier;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;

public class ConsulterBienImmobilierGUI {

	public JFrame frmConsulterLesBiens;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsulterBienImmobilierGUI window = new ConsulterBienImmobilierGUI();
					window.frmConsulterLesBiens.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsulterBienImmobilierGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsulterLesBiens = new JFrame();
		frmConsulterLesBiens.getContentPane().setBackground(new Color(255, 128, 128));
		frmConsulterLesBiens.getContentPane().setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(417, 0, 17, 261);
		frmConsulterLesBiens.getContentPane().add(scrollBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 397, 239);
		frmConsulterLesBiens.getContentPane().add(textArea);
		frmConsulterLesBiens.setTitle("Consulter les biens immobiliers");
		frmConsulterLesBiens.setBounds(100, 100, 450, 300);
		frmConsulterLesBiens.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
