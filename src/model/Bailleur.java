package model;

/**
 * Classe Bailleur
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */
public class Bailleur extends Client {
	/**
	 * adresse postale du bailleur
	 */
	private String adresseBailleur;
	/**
	 * liste des biens immobiliers que possède le bailleur
	 * un bailleur peut avoir un ou plusieurs biens immobiliers
	 */
	//private ArrayList<BienImmobilier>listeBiensImmobiliers;
	
	/**
	 * Constructor
	 * @param id identifiant du client
	 * @param nom nom du client
	 * @param prenom prenom du client
	 * @param mail adresse mail du client
	 * @param numTelephone numéro de téléphone du client
	 * @param adresseBailleur adresse postale du bailleur
	 */
	public Bailleur(int id, String nom, String prenom, String mail, String numTelephone, String adresseBailleur) {
		super(id, nom, prenom, mail, numTelephone);
		this.adresseBailleur = adresseBailleur;
	//	listeBiensImmobiliers = new ArrayList<BienImmobilier>();
	}
	/**
	 * setter pour l'adresse du bailleur
	 * @param aAdresseBailleur: nouvelle valeur de adresseBailleur
	 */
	public void setAdresseBailleur(String aAdresseBailleur) {
		this.adresseBailleur = aAdresseBailleur;
	}
	/**
	 * getter pour l'adresse du bailleur
	 * @return la valeur de adresseBailleur
	 */
	public String getAdresseBailleur() {
		return this.adresseBailleur;
	}
	/**
	 * permet d'ajouter un bien immobilier
	 * @param bi : un bien immobilier 
	 */
	//public void ajouterBienImmobilier(BienImmobilier bi) {
	//	listeBiensImmobiliers.add(bi);
	//}
	/**
	 * permet de supprimer un bien immobilier
	 * @param bi : un bien immobilier
	 */
//	public void supprimerBienImmobilier(BienImmobilier bi) {
	//	listeBiensImmobiliers.remove(bi);
//	}
}
