package de.nikolauspflege.bbw.fiae.schneckenrennen;

public class MainSchnecke {

	public static void main(String[] args) {
		
		Rennschnecke r1 = new Rennschnecke("Gary", "Speedy", 100);
		// changed for testing purpose
		System.out.println(r1.toString());
		r1.krieche();
		System.out.println(r1.toString());
		r1.krieche();
		System.out.println(r1.toString());
		r1.krieche();
		System.out.println(r1.toString());
		
	
		
	}

}
