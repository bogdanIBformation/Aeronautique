package aeronautique;

public class Avion {
	private static int numAv;
	private String nomAv;
	private int capacite;
	private String loc;
	/**
	 * Constructeur pour un avion ayant les caracteristiques suivantes:
	 * @param numAv le numero de l'avion
	 * @param nomAv le nom de l'avion
	 * @param capacite la capacite (nb passageres)
	 * @param loc la localisation (ville)
	 */
	public Avion(int numAv, String nomAv, int capacite, String loc) {
		super();
		this.numAv = numAv;
		this.nomAv = nomAv;
		this.capacite = capacite;
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Avion " +numAv+ " [nomAv=" + nomAv + ", capacite=" + capacite + ", loc=" + loc + "]";
	}
	
	
	//getters + setters
	
	
}