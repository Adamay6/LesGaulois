package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Romain minus;
		minus = new Romain("Minus",6);
		Gaulois asterix;
		asterix = new 	Gaulois("Ast�rix",8);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU...UN GAUGAU...");
		asterix = new 	Gaulois("Ast�rix",8);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
