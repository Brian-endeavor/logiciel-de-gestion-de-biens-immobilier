package dao;
import java.sql.*;
import model.Locataire;
import model.Client;
import dao.ConnectionDAO;

/**
 * Classe d'acces aux donnees contenues dans la table locataire
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */
public class LocataireDAO extends ConnectionDAO {
	
	/**
	 * Constructor
	 */
	public LocataireDAO() {
		super();
	}
	
	/**
	 * Permet d'ajouter un locataire dans la table locataire_lct
	 * @param locataire le locataire a ajouter 
	 * @return retourne le nbre de lignes ajoutees dans la table
	 */
	
	public int add(Locataire locataire) {
		Connection con = null;
		PreparedStatement ps = null;
		int returnValue = 0;
		
		// connexion a la base de donnees
				try {

					// tentative de connexion
					con = DriverManager.getConnection(URL, LOGIN, PASS);
					// preparation de l'instruction SQL, chaque ? represente une valeur
					// a communiquer dans l'insertion.
					// les getters permettent de recuperer les valeurs des attributs souhaites
					ps = con.prepareStatement("INSERT INTO locataire_lct(lct_id, lct_nom, lct_prenom, lct_mail, lct_num_tel) VALUES(?, ?, ?, ?, ?)");
					ps.setInt(1, locataire.getId());
					ps.setString(2, locataire.getNom());
					ps.setString(3, locataire.getPrenom());
					ps.setString(4, locataire.getMail());
					ps.setString(5, locataire.getNumTelephone());
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
	 * permet de recuperer un locataire a partir de sa reference
	 * @param reference la reference du locataire a recuperer
	 * @return le locataire trouvé
	 * null si aucun locataire ne correspond a cette reference
	 */
	public Locataire get(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Locataire returnValue = null;
		
		// connexion a la base de donnees
				try {

					con = DriverManager.getConnection(URL, LOGIN, PASS);
					ps = con.prepareStatement("SELECT * FROM locataire_lct WHERE lct_id = ?");
					ps.setInt(1, id);
				// on execute la requete
					// rs contient un pointeur situe juste avant la premiere ligne retournee
					rs = ps.executeQuery();
					// passe a la premiere (et unique) ligne retournee
					if(rs.next()) {
						returnValue = new Locataire(rs.getInt("lct_id"),
								                  rs.getString("lct_nom"),
								                  rs.getString("lct_prenom"),
								                  rs.getString("lct_mail"),
						                          rs.getString("lct_num_tel"));
					}
	}
				catch (Exception ee) {
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
