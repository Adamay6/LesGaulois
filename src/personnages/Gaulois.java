package personnages;

import personnages.Druide;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	
	
	
	public int getForce() {
		return force;
	}

	
	public int getEffetPotion() {
		return effetPotion;
	}


	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}


	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}


	public String getNom() {
		return nom;
	}


	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}


//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
//		+ romain.getNom());
//		romain.recevoirCoup(force / 3*getEffetPotion());
//		}
//	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophee = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophee != null && i < trophee.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
			}
	}

	
	public void boirePotion (int forcepotion) {
		setEffetPotion(forcepotion);
		parler(" Merci Druide, je sens que ma force est "+ forcepotion + " fois décuplée. ");
					
}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new 	Gaulois("Astérix",8);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Wouhou!");
		Romain minus;
		minus = new Romain("Minus",6);
		asterix.boirePotion(5);
		asterix.frapper(minus);
	}
}
