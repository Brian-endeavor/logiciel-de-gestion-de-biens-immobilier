package dao;
import java.sql.*;

import model.Bailleur;
/**
 * Classe d'acces aux donnees contenues dans la base de donnees
 * Cette classe est un héritage de la classe ConnectionDAO
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 **/
public class BailleurDAO extends ConnectionDAO {
	/**
	 * Constructor
	 */
	public BailleurDAO() {
		super();
	}
	
	/**
	 * Permet d'ajouter un bailleur dans la table bailleur_blr
	 * @param bailleur le bailleur a ajoute
	 * @return retourne le nbre de lignes ajoutees dans la table
	 */
	public int add(Bailleur bailleur) {
		Connection con = null;
		PreparedStatement ps = null;
		int returnValue = 0;
		
		//connexion a la base de donnees
		try {
			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// preparation de l'instruction SQL, chaque ? represente une valeur
			// a communiquer dans l'insertion.
			// les getters permettent de recuperer les valeurs des attributs souhaites
			ps = con.prepareStatement("INSERT INTO bailleur_blr(blr_id,blr_nom, blr_prenom, blr_mail, blr_adresse, blr_num_tel) VALUES(?, ?, ?, ?, ?, ?)");
			ps.setInt(1, bailleur.getId());
			ps.setString(2, bailleur.getNom());
			ps.setString(3, bailleur.getPrenom());
			ps.setString(4, bailleur.getMail());
			ps.setString (5, bailleur.getAdresseBailleur());
			ps.setString(6, bailleur.getNumTelephone());
			// Execution de la requete
						returnValue = ps.executeUpdate();
	}
		catch (Exception e) {
			if (e.getMessage().contains("ORA-00001"))
				System.out.println("Cet identifiant de fournisseur existe déjà. Ajout impossible !");
			else
				e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
			try {
				if (ps != null) {
					ps.close();
				}
			} 
			catch (Exception ignore)
			{
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception ignore) {
			}
		}
		return returnValue;
	}

	/**
	 * Permet de recuperer un bailleur a partir de sa reference
	 * 
	 * @param reference la reference du bailleur a recuperer
	 * @return le bailleur trouve;
	 * 			null si aucun bzilleur ne correspond a cette reference
	 */
	public Bailleur get(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Bailleur returnValue = null;

		// connexion a la base de donnees
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM bailleur_blr WHERE blr_id = ?");
			ps.setInt(1, id);

			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps.executeQuery();
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				returnValue = new Bailleur(rs.getInt("blr_id"),
									       rs.getString("blr_nom"),
									       rs.getString("blr_prenom"),
									       rs.getString("blr_mail"),
									       rs.getString("blr_adresse"),
									       rs.getString("blr_num_tel"));
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du ResultSet, du PreparedStatement et de la Connexion
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception ignore) {
			}
		}
		return returnValue;
	}


}
