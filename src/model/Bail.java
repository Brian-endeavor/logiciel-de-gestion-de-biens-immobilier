package model;
/**
 * Classe BienImmobilier
 * @author AGBATCHOSSOU Lorys Killian Gbèlidji
 * */
public class Bail {
	private String typebi;
	private String duree;
	private String datePriseEffet;
	private String dateEffectiveFin;
	private String dateEcheance;
	private String frequenceRevision;
	private double caution;
	private double charges;
	private double fraisAgence;
	private Garant garant;
	
	/**
	 * constructor
	 * @param duree
	 * @param datePriseEffet
	 * @param dateEffectiveFin
	 * @param dateEcheance
	 * @param frequenceRevision
	 * @param caution
	 * @param charges
	 * @param fraisAgence
	 * @param garant
	 */
	
	public Bail(String typebi, String duree, String datePriseEffet, String dateEffectiveFin, String dateEcheance, String frequenceRevision, double caution, double charges, double fraisAgence, Garant garant) {
		this.typebi = typebi;
		this.duree = duree;
		this.datePriseEffet = datePriseEffet;
		this.dateEffectiveFin = dateEffectiveFin;
		this.dateEcheance = dateEcheance;
		this.frequenceRevision = frequenceRevision;
		this.caution = caution;
		this.charges = charges;
		this.fraisAgence = fraisAgence;
		this.garant = garant;
	}
	
	/**
	 * tous les setters
	 */
	public void setDuree(String aDuree) {
		this.duree = aDuree;
	}
	
	public void setType(String aTypebi) {
		this.typebi = aTypebi;
	}
	public void setDatePriseEffet(String aDatePriseEffet) {
		this.datePriseEffet = aDatePriseEffet;
	}
	public void setDateEcheance(String aDateEcheance) {
		this.dateEcheance = aDateEcheance;
	}
	public void setDateEffectiveFin(String aDateEffectiveFin) {
		this.dateEffectiveFin = aDateEffectiveFin;
	}
	public void setFrequenceRevision(String aFrequenceRevision) {
		this.frequenceRevision = aFrequenceRevision;
	}
	
	
	
	
	
	

}
