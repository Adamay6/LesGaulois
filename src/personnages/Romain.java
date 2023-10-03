package personnages;


public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert (force > 0): "la force d'un Romain est toujours postive";
		this.nom = nom;
		this.force = force;
		
	}
	
	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert (force > 0): "la force d'un Romain est toujours postive";
		int x = getForce();
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert (x > force): "la force d'un Romain n'a pas diminué";
	}
	//public void sEquiper(Equipement epmt) {
	//switch(epmt){
	//case (equipements.length):
				
	//}
	//}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.recevoirCoup(0);
	}
}


