package model;
/**
 * Classe Locataire
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */
public class Locataire extends Client {
	//private String raisonSociale;
	//private Garant garant;
	
	/**
	 * Constructor
	 * @param raisonSociale raison sociale du locataire
	 * @param garant garant du locataire
	 * un locataire peut ne pas avoir de garant
	 */
	public Locataire(int id, String nom, String prenom, String mail, String numTelephone) { //String raisonSociale) 
		super(id, nom, prenom, mail, numTelephone);
		//this.raisonSociale = raisonSociale;
	}
	/**public Locataire(String raisonSociale, Garant garant) {
	*	super();
	*   this.raisonSociale = raisonSociale;
	*   this.garant = garant;
	*   }
	*/
	
	/**
	 * setter pour l'attribut raisonSociale
	 * @param aRaisonSociale : nouvelle valeur de raisonSociale
	 */
	//public void setRaisonSociale(String aRaisonSociale) {
		//this.raisonSociale = aRaisonSociale;
	//}
	/**
	 * setter pour l'attribut garant
	 * @param aGarant : nouvelle valeur de garant
	 */
	//public void setGarant(Garant aGarant) {
	//	this.garant = aGarant;
		//}
	/**
	 * getter pour l'attribut raisonSociale
	 * @return valeur de la raisonSociale
	 */
	//public String getRaisonSociale() {
	//	return this.raisonSociale;
	//}
	/**
	 * getter pour l'attribut garant
	 * @return la nouvelle valeur de garant
	 */
	//public Garant getGarant() {
		//return this.garant;
	//}
	
}
