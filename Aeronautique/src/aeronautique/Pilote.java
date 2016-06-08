package aeronautique;

public class Pilote {
	private static int numPil;
	private String nomPil;
	private String adr;
	private int sal;
	
	/**
	 * Constructor for a pilot.
	 * @param numPil The pilot ID
	 * @param nomPil Pilot name
	 * @param adr address
	 * @param sal salary
	 */
	public Pilote(int numPil, String nomPil, String adr, int sal) {
		super();
		this.numPil = numPil;
		this.nomPil = nomPil;
		this.adr = adr;
		this.sal = sal;
	}

	
	@Override
	public String toString() {
		return "Pilote " +numPil+ " [nomPil=" + nomPil + ", adr=" + adr + ", sal=" + sal + "]";
	}
	
	
}
