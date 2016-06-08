package aeronautique;

public class Principale {

	private static int compteurAvions = 0;
	private static int compteurPilotes = 0;
	
	public static void main(String[] args) {
		
		Avion unAvion = new Avion(compteurAvions++, "Boeing", 320, "Nice");
		System.out.println(unAvion);

		Pilote unPilote = new Pilote(compteurPilotes++, "Jean", "Nice", 20_000);
		System.out.println(unPilote);
		
		//Vol unVol = new Vol();
		//System.out.println(unPilote);
		
		System.out.println("Fin du programe");
	}

}
