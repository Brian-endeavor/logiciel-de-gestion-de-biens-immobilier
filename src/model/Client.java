package model;
/**
 * Classe Client
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */

public class Client {
	/**
	 * reference du client (locataire & bailleur)
	 */
	protected int id;
	/**
	 * nom
	 */
	protected String nom;
	/**
	 * prenom
	 */
	protected String prenom;
	/**
	 * adresse mail
	 */
	protected String mail; 
	/**
	 * numéro de téléphone
	 */
	protected String numTelephone;
	
	/**
	 * Constructor
	 * @param id identifiant du client
	 * @param nom nom du client
	 * @param prenom prenom du client
	 * @param mail adresse mail du client
	 * @param numTelephone numéro de téléphone du client
	 */
	
	public Client(int id, String nom, String prenom, String mail, String numTelephone) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.numTelephone = numTelephone;
    }
	/**
	 * setter pour l'attribut id
	 * @param aId : nouvelle valeur de id 
	 */
	public void setId(int aId) {
		this.id = aId;
	}
	/**
	 * setter pour l'attribut nom
	 * @param aNom : nouvelle valeur du nom 
	 */
	public void setNom(String aNom) {
		this.nom = aNom;
	}
	/**
	 * setter pour l'attribut prenom
	 * @param aPrenom : nouvelle valeur du prenom
	 */
	public void setPrenom(String aPrenom) {
		this.prenom = aPrenom;
	}
	/**
	 * setter pour l'attribut mail
	 * @param aMail : nouvelle valeur du mail
	 */
	public void setMail(String aMail) {
		this.mail = aMail;
	}
	/**
	 * setter pour l'attribut numTelephone
	 * @param aNumTelephone : nouvelle valeur du numéro de téléphone 
	 */
	public void setNumTelephone(String aNumTelephone) {
		this.numTelephone = aNumTelephone;
	}
	
	/**
	 * getter pour l'attribut id
	 * @return valeur de id 
	 */
	public int getId() {
	return id;
	}
	/**
	 * getter pour l'attribut nom
	 * @return valeur du nom 
	 */
	public String getNom() {
	return nom;
	}
	/**
	 * getter pour l'attribut prenom
	 * @return valeur du prenom
	 */
	public String getPrenom() {
	 return prenom;
	}
	/**
	 * getter pour l'attribut mail
	 * @return valeur de mail 
	 */
	public String getMail(){
		return mail;
	}
	/**
	 * getter pour l'attribut numTelephone
	 * @return valeur du numero de telephone
	 */
	public String getNumTelephone() {
		return numTelephone;
	}
	
}
