package model;
/**
 * Classe Client
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */
public class Garant {
	private String nomGarant;
	private String prenomGarant;
	private String adresseGarant;
	
	/**
	 * Constructor
	 * @param nomGarant nom du garant
	 * @param prenomGarant prenom du garant
	 * @param adresseGarant adresse postale du garant
	 */
	public Garant(String nomGarant, String prenomGarant, String adresseGarant) {
		this.nomGarant = nomGarant;
		this.prenomGarant = prenomGarant;
		this.adresseGarant = adresseGarant;
	}
	/**
	 * setter pour l'attribut nomGarant
	 * @param aNomGarant nouvelle valeur de nomGarant
	 */
	public void setNomGarant(String aNomGarant) {
		this.nomGarant = aNomGarant;
	}
	/**
	 * setter pour l'attribut prenomGarant
	 * @param aPrenomGarant nouvelle valeur de prenomGarant
	 */
	public void setPrenomGarant(String aPrenomGarant) {
		this.prenomGarant = aPrenomGarant;
	}
	/**
	 * setter pour l'attribut adresseGarant
	 * @param aAdresseGarant nouvelle valeur de adresseGarant
	 */
	public void setAdresseGarant(String aAdresseGarant) {
		this.adresseGarant = aAdresseGarant;
	}
	/**
	 * getter pour l'attribut nomGarant
	 * @return valeur de nomGarant
	 */
	public String getNomGarant() {
		return this.nomGarant;
	}
	/**
	 * getter pour l'attribut prenomGarant
	 * @return valeur de prenomGarant
	 */
	public String getPrenomGarant() {
		return this.prenomGarant;
	}
	/**
	 * getter pour l'attribut adresseGarant
	 * @return valeur de adresseGarant
	 */
	public String getAdresseGarant() {
		return this.adresseGarant;
	}

}
