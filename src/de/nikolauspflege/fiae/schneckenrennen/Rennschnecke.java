package de.nikolauspflege.fiae.schneckenrennen;

public class Rennschnecke extends Schnecke {

	public Rennschnecke(String derName, String dieRasse, double maxGeschchwindigkeit) {
		super(derName, dieRasse, maxGeschchwindigkeit);
		// TODO Auto-generated constructor stub
	}
	
	public void krieche() {
		double zufallszahl = (double)(Math.random() * this.getvMax()); 
		
	}
	
	public String toString() {
		return "Name der Schnecke ist: " + name;
	}

}
