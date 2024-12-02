
public class PlaneteTellurique extends Planete implements Habitable {
	public PlaneteTellurique(String nom) {
		super(nom);
	}

	public void accueillirVaisseau(Vaisseau vaisseau) {
		if (vaisseau instanceof VaisseauDeGuerre) {
			((VaisseauDeGuerre) vaisseau).desactiverArmes();
		}
		totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;
		if (vaisseauAccoste == null) {
			System.out.println("Aucun vaisseau ne s'en va");
		} else {
			System.out.println("Un vaisseau de type " + vaisseauAccoste.type + " doit s'en aller");
		}
		vaisseauAccoste = vaisseau;
	}
}
