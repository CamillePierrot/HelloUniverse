public class HelloUniverse {

    public static void main(String... args) {
    	int tour;
    	System.out.println(Planete.expansion(10.5));
    	System.out.println(Planete.expansion(14.2));
    	
    	PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        tour=venus.rotation(1250);
        System.out.println(tour);
        
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        tour=mars.rotation(-684);
        System.out.println(tour);
        Vaisseau nouveauVaisseau = new VaisseauDeGuerre ("FREGATE");
        nouveauVaisseau.nbPassagers=9;
        
        Vaisseau autreVaisseau=new VaisseauDeGuerre("CROISEUR");
        autreVaisseau.nbPassagers=42;
        
        System.out.println("Le nombre d'humains ayant déjà séjournée sur Mars est actuellement de "+mars.totalVisiteurs);
        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de "+ mars.nom +" est : " + Planete.forme);
        
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;
        uranus.atmosphere = atmosphereUranus;
        System.out.println("L'atmosphere de Uranus est composée :");
        System.out.println("A " + atmosphereUranus.tauxHydrogene + "% d'hydrogene");
        System.out.println("A " + atmosphereUranus.tauxHelium + "% d'hélium");
        System.out.println("A " + atmosphereUranus.tauxMethane + "% de méthane");

        
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        tour=neptune.revolution(-3542);
        System.out.println(tour);
        
        System.out.println("Le nombre de planètes découvertes est actuellement de "+Planete.nbPlanetesDecouvertes);
        
        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier=2;
        
        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;
        
        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();
        
       
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "lasers photoniques", 3);
        
        vaisseauMonde.desactiverBouclier();
        
        System.out.println("La résistance du bouclier du Vaisseau-Monde est de " + vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du Vaisseau-Monde est de " + vaisseauMonde.blindage);
        
        mars.accueillirVaisseau(vaisseauMonde);
        
        mars.accueillirVaisseau(chasseur);
        
        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println("Le chasseur a rejeté " + chasseurSurTerre.emporterCargaison(20)+" tonnes.");
        
        Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nbPassagers=100;
        terre.accueillirVaisseau(fregateSurTerre);
        System.out.println("La fregate a rejeté " + fregateSurTerre.emporterCargaison(45)+" tonnes.");
        System.out.println("La fregate a rejeté " + fregateSurTerre.emporterCargaison(12)+" tonnes.");
        
        Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nbPassagers=14;
        terre.accueillirVaisseau(fregateSurTerre2);
        System.out.println("La fregate 2 a rejeté " + fregateSurTerre2.emporterCargaison(30)+" tonnes.");
        
        Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println("Le vaisseau-monde a rejeté " + vaisseauMondeSurTerre.emporterCargaison(1560)+" tonnes.");
        System.out.println("Le vaisseau-monde a rejeté " + vaisseauMondeSurTerre.emporterCargaison(600)+" tonnes.");
        
    }

}
