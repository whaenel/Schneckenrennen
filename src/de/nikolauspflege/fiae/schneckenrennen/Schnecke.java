/**
 * 
 */
package de.nikolauspflege.fiae.schneckenrennen;

/**
 * Prototyp einer Rennschnecke
 * @author walter
 * @version 1.0
 */
public abstract class Schnecke {
	protected final String name; 	// der Name der Schnecke
	protected final String rasse; // die Rasse der Schnecke
	protected final double vMax;	// die Maximalgeschwindigkeit der Schnecke im Rennen
	protected double rennStrecke = 0;		// die zurückgelegte Strecke im Rennen in mm
	protected double gesamtStrecke = 0;    // die zurückgelegte strecke in allen Rennen
	protected int rennZeit= 0;		// die Zeit im aktuellen Rennen
	protected int gesamtZeit =0 ;		// die Zeit in allen Rennen
	
	public Schnecke ( String derName, String dieRasse, double maxGeschchwindigkeit){
		name = derName;
		rasse= dieRasse;
		vMax = maxGeschchwindigkeit;
	}
	

	/**
	 * Bewegt die Schnecke mit einer zufälligen Geschwindigkeit (im Abhängigkeit von der Maximalgeschwindigkeit).
	 */
	public abstract void krieche();
	
	/**
	 * Gibt den Namen der Schnecke zurück.
	 * @return Name
	 */
	public String getName()
	{
		return name;
	}


	public double getRennStrecke() {
		return rennStrecke;
	}


	public void setRennStrecke(double rennStrecke) {
		this.rennStrecke = rennStrecke;
	}


	public double getGesamtStrecke() {
		return gesamtStrecke;
	}


	public void setGesamtStrecke(double gesamtStrecke) {
		this.gesamtStrecke = gesamtStrecke;
	}


	public int getRennZeit() {
		return rennZeit;
	}


	public void setRennZeit(int rennZeit) {
		this.rennZeit = rennZeit;
	}


	public int getGesamtZeit() {
		return gesamtZeit;
	}


	public void setGesamtZeit(int gesamtZeit) {
		this.gesamtZeit = gesamtZeit;
	}


	public String getRasse() {
		return rasse;
	}


	public double getvMax() {
		return vMax;
	}

}
