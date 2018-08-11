package de.nikolauspflege.bbw.fiae.schneckenrennen;

import java.text.DecimalFormat;

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
		 DecimalFormat f = new DecimalFormat("#0.00");
		return "Name der Schnecke ist: " + name + " und sie ist insgesamt " +  f.format(gesamtStrecke) + "mm gekrochen";
	}
	
	

}
