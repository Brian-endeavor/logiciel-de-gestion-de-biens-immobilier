package gui;

import java.awt.EventQueue;
import model.BienImmobilier;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.BiensImmobiliersDAO;


import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ConsulterBailbailleurGUI {

	public JFrame frmBaillocataire;
	int idd2;
	
	public ConsulterBailbailleurGUI (int ad) {
		 idd2=ad;
		initialize();
		
	}
	
	
	public void initialize () {
		
		frmBaillocataire = new JFrame();
		frmBaillocataire.setTitle(" detail  du contrat de bail ");		
		frmBaillocataire.setBounds(100, 100, 400, 400);
		frmBaillocataire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBaillocataire.getContentPane().setLayout(new BorderLayout());

	        // Table model
	        String[] columnNames = { "Noms_du_locataire ", "type_de_logement", "Nom_du_proprietaire ", " CP_du_logement"," ville "," rue "," num "," durée","DEBUT"," FIN "," loyer "," statut "," solde "," nom_du_responsable"," numero_du_responsable"};
	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columnNames);

	        // JTable setup
	        JTable table = new JTable(model);
	        table.setBackground(new Color(255, 255, 128));
	        table.setFillsViewportHeight(true);

	        // Add scroll pane
	        JScrollPane scrollPane;
	        scrollPane = new JScrollPane(table);
	        frmBaillocataire.getContentPane().add(scrollPane, BorderLayout.CENTER);

	        // Database connection and fetching data
	        loadData(model);
	        frmBaillocataire.setVisible(true);
	    }
	              
	    /**
	     * Loads data from the database into the table model
	     */
	    private void loadData(DefaultTableModel model) {
	        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.esigelec.fr:1521:orcl", "C##BDD2_6", "BDD26");
	             PreparedStatement ps = con.prepareStatement("SELECT bl_nom_locataire,bl_type_logement,blt_nom_proprietaire,bl_codePostal_logement, bl_ville_logement, bl_rue_logement, bl_num_logement, bl_duree_mois, bl_date_debut, bl_date_fin, bl_loyer_mensuel, bl_statut, bl_solde, bl_nom_responsable, bl_num_responsable"
	           
	             		+ "  FROM BAIL_LOCATAIRE WHERE bl_lct_id = ? ")) {
	             //AuthentificationGui ath = new AuthentificationGui();
	        	//System.out.println(idd2); // Debugging output
	            int cet_Id = idd2; 
	            ps.setInt(1, cet_Id);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	System.out.println(idd2);
	               // int ID_du_locataire = rs.getInt("bl_id");
	                String  Noms_du_locataire=  rs.getString("bl_nom_locataire");
	                String type_de_logement= rs.getString("bl_type_logement");
	                String Nom_du_proprietaire = rs.getString("blt_nom_proprietaire");
	                int  CP_du_logement = rs.getInt("bl_codePostal_logement");
	                 String ville= rs.getString("bl_ville_logement");
	                 String rue= rs.getString("bl_rue_logement");
	                 int num=  rs.getInt("bl_num_logement");
	                 String  durée= rs.getString("bl_duree_mois");
	                 String  DEBUT=rs.getString("bl_date_debut");
	                 String  FIN=rs.getString("bl_date_fin");
	                 String loyer = rs.getString("bl_loyer_mensuel");
	                String   statut= rs.getString("bl_statut");
	                String solde = rs.getString("bl_solde");
	                String nom_du_responsable =rs.getString("bl_nom_responsable");
	                int numero_du_responsable= rs.getInt("bl_num_responsable");
	                //int = rs.getInt("bl_lct_id");

	                model.addRow(new Object[]{ Noms_du_locataire, type_de_logement, Nom_du_proprietaire , CP_du_logement, ville ,rue , num , durée,DEBUT, FIN , loyer , statut , solde , nom_du_responsable, numero_du_responsable});
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
		
	}
	

	
	
	

	
	

