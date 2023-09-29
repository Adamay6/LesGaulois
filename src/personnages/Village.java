package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbvillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public Gaulois[] getVillageois() {
		return villageois;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbvillageois < villageois.length) {
			villageois[nbvillageois]= gaulois;
			nbvillageois = nbvillageois + 1;
		}
		System.out.println("Le villageois "+ gaulois.getNom()+" fait maintenant partie du village" + getNom());
	}
	public Gaulois trouverHabitant( int numero ) {
		Gaulois tmp = villageois[numero - 1];
		System.out.println("Le villageois numéro "+ numero + " est "+ tmp.getNom()+ ". Il a une force de "+ tmp.getForce());
		return tmp;
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+ chef.getNom()+" vivent les légendaires gaulois :");
		for(int i=0; i< nbvillageois; i++) {
			Gaulois temp = villageois[i];
			System.out.println(temp.getNom());
		}
	}
	public static void main(String[] args) {
		Village irreductible = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = irreductible.trouverHabitant(30);
		//Erreur d'exception parce que le village est vide
		Chef Abraracourcix = new Chef("Abraracourcix", 6, irreductible);
		irreductible.setChef(Abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		irreductible.ajouterHabitant(asterix);
		//Gaulois gaulois = irreductible.trouverHabitant(1);
		//System.out.println(gaulois);
		//affiche asterix qui est le premier habitant du village des irreductibles
		Gaulois obelix = new Gaulois("Obélix", 25);
		irreductible.ajouterHabitant(obelix);
		irreductible.afficherVillageois();
		
		
	}
}
