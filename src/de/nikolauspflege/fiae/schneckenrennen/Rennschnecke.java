package de.nikolauspflege.fiae.schneckenrennen;

public class Rennschnecke extends Schnecke {

	public Rennschnecke(String derName, String dieRasse, double maxGeschchwindigkeit) {
		super(derName, dieRasse, maxGeschchwindigkeit);
		// TODO Auto-generated constructor stub
	}
	
	public void krieche() {
		double zufallszahl = (double)(Math.random() * this.getvMax()); 
		 gesamtStrecke += zufallszahl;
	}
	
	public String toString() {
		return "Name der Schnecke ist: " + name + " und sie ist insgesamt " + gesamtStrecke +"mm gekrochen";
	}

}
