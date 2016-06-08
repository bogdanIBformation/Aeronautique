package aeronautique;

public class Avion {
	private static int numAv;
	private String nomAv;
	private int capacite;
	private String loc;
	private int enPlus;
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
		this.enPlus = 15;
	}

	//getters + setters
	/**
	 * Get the ground location of the plane
	 * @return the city.
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * Set the ground position of the plane
	 * @param loc the city (location)
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	@Override
	public String toString() {
		return "Avion " +numAv+ " [nomAv=" + nomAv + ", capacite=" + capacite + ", loc=" + loc + "]";
	}	
}
