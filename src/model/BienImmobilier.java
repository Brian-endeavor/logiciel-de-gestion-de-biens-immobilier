package model;

/**
 * Classe BienImmobilier
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */
public class BienImmobilier {
	/**
	 * reference d'un bien immobilier
	 */
	protected int idBienImmo;
	protected int nbreChambre;
	protected int codePostal;
	protected int numRue;
	protected int anneeConstruction;
	protected String ville;
	protected String typeRue;
	protected String nomRue;
	protected String type;
	protected String typeChauffage;
	protected double superficie;
	protected double superficieCour;
	protected double superficieBalcon;
	protected double superficieTerasse;
	protected double superficieJardin;
	protected boolean meuble;
	protected boolean balcon;
	protected boolean cour;
	protected boolean cave;
	protected boolean terasse;
	protected boolean jardin;
	/**
	 * attribut privé bailleur
	 * un bailleur possède un ou plusieurs biens immobiliers
	 */
	//private Bailleur aBailleur;
	
	/**
	 * Constructor
	 * @param tous les attributs précédents
	 * @param aBailleur un bailleur
	 */
	public BienImmobilier(int idBienImmo,  int nbreChambre, int codePostal, int numRue, int anneeConstruction, String ville, String typeRue, String nomRue, String type, String typeChauffage, double superficie, double superficieCour, double superficieBalcon, double superficieTerasse,double superficieJardin, boolean meuble,boolean balcon, boolean cour, boolean cave, boolean terasse, boolean jardin) {  //Bailleur aBailleur
		this.idBienImmo = idBienImmo;
		this.nbreChambre = nbreChambre;
		this.codePostal = codePostal;
		this.numRue = numRue;
		this.anneeConstruction = anneeConstruction;
		this.ville = ville;
		this.typeRue = typeRue;
		this.nomRue = nomRue;
		this.type = type;
		this.typeChauffage = typeChauffage;
		this.superficie = superficie;
		this.superficieCour = superficieCour;
		this.superficieBalcon = superficieBalcon;
	    this.superficieTerasse = superficieTerasse;
		this.superficieJardin = superficieJardin;
		this.meuble = meuble;
		this.balcon = balcon;
		this.cour = cour;
		this.cave = cave;
		this.terasse = terasse;
		this.jardin = jardin;	
		//this.aBailleur = aBailleur;
  }
	/**
	 * getter pour l'attribut aBailleur
	 * @return aBailleur valeur de bailleur 
	 */
	//public Bailleur getBailleur() {
	//	return aBailleur;
	//}
	/**
	 * setter pour l'attribut aBailleur
	 * @param aNewBailleur :  nouvelle valeur de aBailleur
	 */
//	public void setAbailleur(Bailleur aNewBailleur) {
	//	this.aBailleur = aNewBailleur;
	//}
	
	/**
	 * getter pour tous les attributs sauf aBailleur
	 */
	public int getIdBienImmo() {
		return idBienImmo;
	}
	public int getNbreChambre() {
		return nbreChambre;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public int getNumRue() {
		return numRue;
	}
	public int getAnneeConstruction() {
		return anneeConstruction;
	}
	public String getVille() {
		return ville;
	}
	public String getTypeRue() {
		return typeRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public String getType() {
		return type;
	}
	public String getTypeChauffage() {
		return typeChauffage;
	}
	public double getSuperficie() {
		return superficie;
	}
	public double getSuperficieCour() {
		return superficieCour;
	}
	public double getSuperficieJardin() {
		return superficieJardin;
	}
	public double getSuperficieBalcon() {
		return superficieBalcon;
	}
	public double getSuperficieTerasse() {
		return superficieTerasse;
	}
	public boolean getCour() {
		return cour;
	}
	public boolean getCave() {
		return cave;
	}
	public boolean getMeuble(){
		return meuble;
	}
	public boolean getBalcon() {
		return balcon;
	}
	public boolean getTerasse() {
		return terasse;
	}
	public boolean getJardin() {
		return jardin;
	}
	/**
	 * setter pour tous les attributs sauf aBailleur
	 */
	public void setIdBienImmo(int newIdBienImmo) {
	   this.idBienImmo = newIdBienImmo;
	}
	public void setNbreChambre(int newNbreChambre) {
	   this.nbreChambre = newNbreChambre;
	}
	public void setCodePostal(int newCodePostal) {
		this.codePostal = newCodePostal;
	}
	public void setNumRue(int newNumRue) {
		this.numRue = newNumRue;
	}
	public void setAnneeConstruction(int newAnneeConstruction) {
		this.anneeConstruction = newAnneeConstruction;
	}
	public void setVille(String newVille) {
		this.ville = newVille;
	}
	public void setTypeRue(String newTypeRue) {
		this.typeRue = newTypeRue;
	}
	public void setNomRue(String newNomRue) {
		this.nomRue = newNomRue;
	}
	public void setType(String newType) {
		this.type = newType;
	}
	public void setTypeChauffage(String newTypeChauffage) {
		this.typeChauffage = newTypeChauffage;
	}
	public void setSuperficie(double aSuperficie) {
		this.superficie = aSuperficie;
	}
	public void setSuperficieCour(double aSuperficieCour) {
		this.superficieCour = aSuperficieCour;
	}
	public void setSuperficieJardin(double aSuperficieJardin) {
		this.superficieJardin = aSuperficieJardin;
	}
	public void setSuperficieBalcon(double aSuperficieBalcon) {
		this.superficieBalcon = aSuperficieBalcon;
	}
	public void setSuperficieTerasse(double aSuperficieTerasse) {
		this.superficieTerasse = aSuperficieTerasse;
	}
	public void setCour(boolean aCour) {
	   this.cour = aCour;
	}
	public void setCave(boolean aCave) {
		this.cave = aCave;
	}
	public void setMeuble(boolean aMeuble){
		this.meuble = aMeuble;
	}
	public void setBalcon(boolean aBalcon) {
		this.balcon = aBalcon;
	}
	public void setTerasse(boolean aTerasse) {
		this.terasse = aTerasse;
	}
	public void setJardin(boolean aJardin) {
	    this.jardin = aJardin;
	}
}
