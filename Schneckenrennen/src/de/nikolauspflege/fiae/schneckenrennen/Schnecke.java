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
	private final String name; 	// der Name der Schnecke
	private final String rasse; // die Rasse der Schnecke
	private final double vMax;	// die Maximalgeschwindigkeit der Schnecke im Rennen
	private double rennStrecke = 0;		// die zurückgelegte Strecke im Rennen in mm
	private double gesamtStrecke = 0;    // die zurückgelegte strecke in allen Rennen
	private int rennZeit= 0;		// die Zeit im aktuellen Rennen
	private int gesamtZeit =0 ;		// die Zeit in allen Rennen
	
	public Schnecke ( String derName, String dieRasse, double maxGeschchwindigkeit){
		name = derName;
		rasse= dieRasse;
		vMax = maxGeschchwindigkeit;
	}
	

	/**
	 * Bewegt die Schnecke mit einer zufälligen Geschwindigkeit (im Abhängigkeit von der Maximalgeschwindigkeit).
	 */
	public abstract void krieche();
	

}
