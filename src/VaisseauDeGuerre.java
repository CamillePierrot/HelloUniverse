
public class VaisseauDeGuerre extends Vaisseau {
	
	boolean armesDesactivees;
	
	VaisseauDeGuerre(String type) {
		this.type=type;
		if (type.equals("CHASSEUR")) {
			tonnageMax=0;
		}
		else if (type.equals("FREGATE")) {
			tonnageMax=50;
		}
		else if (type.equals("CROISEUR")) {
			tonnageMax=100;
		}
			};
		
	void attaque(Vaisseau cible, String arme, int dureeAttaque) {		
		if (armesDesactivees) {
			System.out.println("Attaque impossible, l'armement est désactivé");
		}
		else {
		System.out.println("Un vaisseau de type  "+ type + " attaque un vaisseau de type " 
				+ cible.type + " en utilisant l'arme "+ arme + " pendant " + dureeAttaque + " min");
		cible.resistanceDuBouclier=0;
		cible.blindage = cible.blindage/2;
	}
	};
	
	void desactiverArmes() {
		System.out.println("Désactivation des armes d'un vaisseau de type " +type);
		armesDesactivees=true;
	}

	@Override
	void activerBouclier() {
		desactiverArmes();
		// TODO Auto-generated method stub
		super.activerBouclier();
	}

	@Override
	int emporterCargaison(int cargaison) {
	if (type.equals("CHASSEUR")) {
			return cargaison;
	}
	else {
		if (nbPassagers<12) {
			return cargaison;
		}
		else {
			int tonnagePassagers=2*nbPassagers;
			int tonnageRestant=tonnageMax-tonnageActuel;
			int tonnageAConsiderer=(tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
			if (cargaison>tonnageAConsiderer) {
				tonnageActuel=tonnageMax;
				return cargaison-tonnageAConsiderer;
			}
			else {
				tonnageActuel+=cargaison;
				return 0;
			}
		}
	}
	};
}
	
	
