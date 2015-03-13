package org.sudoku.sftwring;

public class GrafikoenProba {
	public static void main(String[] args) {
	    
	    	klsfProba();
	    
	}
	private static void klsfProba() {
		
		for (int i = 0; i < 30; i++) {
			ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("erab"+i, "qwerty");
			ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(i).gehituPuntuak(i*10);
		}
		ErabiltzaileLista.getErabiltzaileLista().getKlasifikazioa().eguneratu();
		Erabiltzaile erab = ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(1);
		KlasifikazioLehioa.main(erab);
	}
}
