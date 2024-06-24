package dao;
import java.sql.*;
import java.util.ArrayList;

import model.BienImmobilier;

/**
 * pour l'instant, je laisse blr_id 
 * Ici, on ne pourra que ajouter, récupérer et afficher un bien immobilier
 */

/**
 * Classe d'acces aux donnees contenues dans la base de donnees
 * Cette classe est un héritage de la classe ConnectionDAO
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 **/
public class BiensImmobiliersDAO extends ConnectionDAO {
	/**
	 * Constructor
	 */
	public BiensImmobiliersDAO() {
		super();
	}
	
	/**
	 * Permet d'ajouter un bien immobilier dans la table Biens Immmobiliers
	 * Chaque insertion est validée (mode auto-commit par défaut)
	 * @param bi le bien immobilier a ajouter
	 * @return retourne le nombre de lignes ajoutees dans la table
	 */
	public int add(BienImmobilier bi) {
		Connection con = null;
		PreparedStatement ps = null;
		int returnValue = 0;
		
		//connexion a la base de donnees
		try {
			
			//tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// preparation de l'instruction SQL, chaque ? represente une valeur
			// a communiquer dans l'insertion.
			// les getters permettent de recuperer les valeurs des attributs souhaitees
			ps = con.prepareStatement("INSERT INTO BienImmobilier_bi(bi_id, bi_type, bi_ville, bi_cp, bi_numrue, bi_typerue, bi_nomrue, bi_nbchambre, bi_superficie, bi_meublé, bi_balcon, bi_superficiebalcon, bi_terrace, bi_superficieterrace, bi_annéeconstruite, bi_typechauffage, bi_cour, bi_superficiecour, bi_jardin, bi_superficiejardin, bi_cave) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?)");
			ps.setInt(1, bi.getIdBienImmo());
			ps.setString(2, bi.getType());
			ps.setString(3, bi.getVille());
			ps.setInt(4, bi.getCodePostal());
			ps.setInt(5, bi.getNumRue());
			ps.setString(6, bi.getTypeRue());
			ps.setString(7, bi.getNomRue());
			ps.setInt(8, bi.getNbreChambre());
			ps.setDouble(9, bi.getSuperficie());
			ps.setBoolean(10, bi.getMeuble());
			ps.setBoolean(11, bi.getBalcon());
			ps.setDouble(12, bi.getSuperficieBalcon());
			ps.setBoolean(13, bi.getTerasse());
			ps.setDouble(14, bi.getSuperficieTerasse());
			ps.setInt(15, bi.getAnneeConstruction());
			ps.setString(16, bi.getTypeChauffage());
			ps.setBoolean(17, bi.getCour());
			ps.setDouble(18, bi.getSuperficieCour());
			ps.setBoolean(19, bi.getJardin());
			ps.setDouble(20, bi.getSuperficieJardin());
			ps.setBoolean(21, bi.getCave());
			
			
			//Execution de la requete
			returnValue = ps.executeUpdate();
			}
		catch (Exception e) {
			if(e.getMessage().contains("ORA-00001"))
				System.out.println("Bien immobilier deja existant. Ajout impossible.");
			else
				e.printStackTrace();
		}
		finally {
			// fermeture du preparedStatement et de la connexion
			try {
				if(ps != null) {
					ps.close();
				}
			} 
			catch (Exception ignore)
			{	
			}
			try {
				if(con != null) {
					con.close();
				}
			} catch (Exception ignore) {
				
			}
		}
			return returnValue;	
		
		}
		/**
		 * Permet de recuperer un bien immobilier a partir de sa reference
		 * 
		 * @param reference la reference du bien immobilier a recuperer
		 * @return le bien immobilier trouve;
		 * 			null si aucun bien immobilier ne correspond a cette reference
		 */
		public BienImmobilier get(int id) {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			BienImmobilier returnValue = null;
			//connexion a la base de donnees
			try {
				con = DriverManager.getConnection(URL, LOGIN, PASS);
				ps = con.prepareStatement("SELECT * FROM BienImmobilier_bi WHERE bi_id = ?");
				
				//on execute la requete
				// rs contient un pointeur situe juste avant la premiere ligne retournee
				rs = ps.executeQuery();
				//passe a la premiere (et unique) ligne retournee
				if(rs.next()) {
					returnValue = new BienImmobilier(rs.getInt("bi_id"),
							                     rs.getInt("bi_cp"),
							                     rs.getInt("bi_numRue"),
							                     rs.getInt("bi_nbChambre"),
							                     rs.getInt("bi_anneeConstruite"),
							                     rs.getString("bi_nomRue"),
							                     rs.getString("bi_typeRue"),
							                     rs.getString("bi_typeChauffage"),
							                     rs.getString("bi_type"),
							                     rs.getString("bi_ville"),
							                     rs.getDouble("bi_superficie"),
							                     rs.getDouble("bi_superficieBalcon"),
							                     rs.getDouble("bi_superficieTerrace"), //terasse
							                     rs.getDouble("bi_superficieCour"),
							                     rs.getDouble("bi_superficieJardin"),
							                     rs.getBoolean("bi_jardin"),
							                     rs.getBoolean("bi_meuble"),
							                     rs.getBoolean("bi_balcon"),
							                     rs.getBoolean("bi_cour"),
							                     rs.getBoolean("bi_cave"),
							                     rs.getBoolean("bi_terrace")); //terrasse)
					                             
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
		
		/**
		 * Permet de recuperer tous les biens immobiliers stockees dans la table Biens Immobiliers
		 * @return une ArrayList de Biens Immobiliers
		 * null si aucun bien immobilier ne correspond a cette reference
		 */
		public ArrayList<BienImmobilier> getList(){
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			ArrayList<BienImmobilier> returnValue = new ArrayList<BienImmobilier>();
			
			//connexion a la base de donnees
			try {
				con = DriverManager.getConnection(URL, LOGIN, PASS);
				ps = con.prepareStatement("SELECT * FROM BienImmobilier_bi ORDER BY bi_id");
				
				//on execute la requete
				rs = ps.executeQuery();
				// on parcourt les lignes du resultat
				while (rs.next()) { //les noms des attributs dans la bdd
					returnValue.add(new BienImmobilier(rs.getInt("bi_id"),
		                     rs.getInt("bi_cp"),
		                     rs.getInt("bi_numRue"),
		                     rs.getInt("bi_nbChambre"),
		                     rs.getInt("bi_anneeConstruite"),
		                     rs.getString("bi_nomRue"),
		                     rs.getString("bi_typeRue"),
		                     rs.getString("bi_typeChauffage"),
		                     rs.getString("bi_type"),
		                     rs.getString("bi_ville"),
		                     rs.getDouble("bi_superficie"),
		                     rs.getDouble("bi_superficieBalcon"),
		                     rs.getDouble("bi_superficieTerrace"), //terasse
		                     rs.getDouble("bi_superficieCour"),
		                     rs.getDouble("bi_superficieJardin"),
		                     rs.getBoolean("bi_jardin"),
		                     rs.getBoolean("bi_meuble"),
		                     rs.getBoolean("bi_balcon"),
		                     rs.getBoolean("bi_cour"),
		                     rs.getBoolean("bi_cave"),
		                     rs.getBoolean("bi_terrace"))); //terrasse)
		                    }
			
		          }
			catch (Exception ee) {
				ee.printStackTrace();
			} finally {
				// fermeture du rs, du preparedStatement et de la connexion
				try {
					if (rs != null)
						rs.close();
				} catch (Exception ignore) {
				}
				try {
					if (ps != null)
						ps.close();
				} catch (Exception ignore) {
				}
				try {
					if (con != null)
						con.close();
				} catch (Exception ignore) {
				}
			}
			return returnValue;
		}

		
		
}