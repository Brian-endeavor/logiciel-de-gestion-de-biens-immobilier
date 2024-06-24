package gui;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsulterInfosLocataireGui  {
    public JFrame frmConsulterMesInformations;
    private int idd;
     /**
     * Launch the application.
     */
		/*
		 * public static void main(String[] args) { EventQueue.invokeLater(new
		 * Runnable() { public void run() { try { ConsulterInfosLocataireGui window =
		 * new ConsulterInfosLocataireGui();
		 * window.frmConsulterMesInformations.setVisible(true); } catch (Exception e) {
		 * e.printStackTrace(); } } }); }
		 */

    /**
     * Create the application.
     */
    public ConsulterInfosLocataireGui(int iddd) {
    	idd=iddd;
    	initialize();
        
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	
        frmConsulterMesInformations = new JFrame();
        frmConsulterMesInformations.setTitle("Consulter mes informations personnelles");
        frmConsulterMesInformations.setBounds(100, 100, 700, 400);
        frmConsulterMesInformations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmConsulterMesInformations.getContentPane().setLayout(new BorderLayout());

        // Table model
        String[] columnNames = {"ID", "Nom", "Prénom", "Email", "Numéro de Téléphone"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        // JTable setup
        JTable table = new JTable(model);
        table.setBackground(new Color(255, 255, 128));
        table.setFillsViewportHeight(true);

        // Add scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        frmConsulterMesInformations.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Database connection and fetching data
        loadData(model);
        frmConsulterMesInformations.setVisible(true);
    }

    /**
     * Loads data from the database into the table model
     */
    private void loadData(DefaultTableModel model) {
        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.esigelec.fr:1521:orcl", "C##BDD2_6", "BDD26");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM locataire_lct WHERE lct_id = ?")) {
             //AuthentificationGui ath = new AuthentificationGui();
        	//System.out.println(idd); // Debugging output
            int cet_Id = idd; 
            ps.setInt(1, cet_Id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               // System.out.println("Row found"); // Debugging output
                int id = rs.getInt("lct_id");
                String nom = rs.getString("lct_nom");
                String prenom = rs.getString("lct_prenom");
                String email = rs.getString("lct_mail");
                String numTel = rs.getString("lct_num_tel");

                model.addRow(new Object[]{id, nom, prenom, email, numTel});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
