package fr.natsystem.entites;

public interface Forme {  // d�claration de l'interface
	// contraint les classes qui l'impl�mente a d�finir les m�thodes
	// ci dessous
	public double calculPerimetre();
	// toute classe impl�mentant cette interface
	// doit poss�der ces methodes
	public double calculAire();

}
