package personnages;

import java.util.Random;
import personnages.Gaulois;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	public void preparerPotion() {
		Random x = new Random();
		int forcepotion1 = x.nextInt(effetPotionMin,effetPotionMax);
		if (forcepotion1 > 7) {
			System.out.println(prendreParole()+ "<< J'ai préparé une super potion de force >>");
		} else {
			System.out.println(prendreParole()+ "<< Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force >>");
		}
		setForcePotion(forcepotion1);
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()== "Obélix") {
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gaulois.boirePotion(getForcePotion());
		}
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,20);
		panoramix.preparerPotion();
	}
}
