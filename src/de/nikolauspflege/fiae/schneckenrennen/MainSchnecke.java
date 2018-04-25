package de.nikolauspflege.fiae.schneckenrennen;

public class MainSchnecke {

	public static void main(String[] args) {
		
		Rennschnecke r1 = new Rennschnecke("Gary", "Speedy", 100);
		System.out.println(r1.toString());
		r1.krieche();
		System.out.println(r1.toString());
		r1.krieche();
		System.out.println(r1.toString());
		r1.krieche();
		System.out.println(r1.toString());
		
	}

}
