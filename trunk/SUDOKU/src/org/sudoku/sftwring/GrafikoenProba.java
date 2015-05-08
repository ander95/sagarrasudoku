package org.sudoku.sftwring;

import java.io.IOException;

public class GrafikoenProba {
	public static void main(String[] args) {

		sudokuProba();
		//	    	klsfProba();

	}
	@SuppressWarnings("unused")
	private static void klsfProba() {

		for (int i = 0; i < 30; i++) {
			ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("erab"+i, "qwerty");
			ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(i).gehituPuntuak(i*10);
		}
		ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("erab"+30, "qwerty");
		ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(30).gehituPuntuak(1*10);
		ErabiltzaileLista.getErabiltzaileLista().getKlasifikazioa().eguneratu();
		Erabiltzaile erab = ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(6);
		KlasifikazioLehioa.main(erab);
	}

	private static void sudokuProba() {
		Sudokua s = new Sudokua();

		s.getBloke(0).setKasila(0,0, new Kasila(5));
		s.getBloke(0).getKasila(0,0).setFinkoa(true);
		s.getBloke(0).setKasila(0,1, new Kasila(3));
		s.getBloke(0).getKasila(0,1).setFinkoa(true);
		s.getBloke(0).setKasila(0,2, new Kasila(4));
		s.getBloke(0).setKasila(1,0, new Kasila(6));
		s.getBloke(0).getKasila(1,0).setFinkoa(true);
		s.getBloke(0).setKasila(1,1, new Kasila(7));
		s.getBloke(0).setKasila(1,2, new Kasila(2));
		s.getBloke(0).setKasila(2,0, new Kasila(1));
		s.getBloke(0).setKasila(2,1, new Kasila(9));
		s.getBloke(0).getKasila(2,1).setFinkoa(true);
		s.getBloke(0).setKasila(2,2, new Kasila(8));
		s.getBloke(0).getKasila(2,2).setFinkoa(true);

		s.getBloke(1).setKasila(0,0, new Kasila(6));
		s.getBloke(1).setKasila(0,1, new Kasila(7));
		s.getBloke(1).getKasila(0,1).setFinkoa(true);
		s.getBloke(1).setKasila(0,2, new Kasila(8));
		s.getBloke(1).setKasila(1,0, new Kasila(1));
		s.getBloke(1).getKasila(1,0).setFinkoa(true);
		s.getBloke(1).setKasila(1,1, new Kasila(9));
		s.getBloke(1).getKasila(1,1).setFinkoa(true);
		s.getBloke(1).setKasila(1,2, new Kasila(5));
		s.getBloke(1).getKasila(1,2).setFinkoa(true);
		s.getBloke(1).setKasila(2,0, new Kasila(3));
		s.getBloke(1).setKasila(2,1, new Kasila(4));
		s.getBloke(1).setKasila(2,2, new Kasila(2));

		s.getBloke(2).setKasila(0,0, new Kasila(9));
		s.getBloke(2).setKasila(0,1, new Kasila(1));
		s.getBloke(2).setKasila(0,2, new Kasila(2));
		s.getBloke(2).setKasila(1,0, new Kasila(3));
		s.getBloke(2).setKasila(1,1, new Kasila(4));
		s.getBloke(2).setKasila(1,2, new Kasila(8));
		s.getBloke(2).setKasila(2,0, new Kasila(5));
		s.getBloke(2).setKasila(2,1, new Kasila(6));
		s.getBloke(2).getKasila(2,1).setFinkoa(true);
		s.getBloke(2).setKasila(2,2, new Kasila(7));

		s.getBloke(3).setKasila(0,0, new Kasila(8));
		s.getBloke(3).getKasila(0,0).setFinkoa(true);
		s.getBloke(3).setKasila(0,1, new Kasila(5));
		s.getBloke(3).setKasila(0,2, new Kasila(9));
		s.getBloke(3).setKasila(1,0, new Kasila(4));
		s.getBloke(3).getKasila(1,0).setFinkoa(true);
		s.getBloke(3).setKasila(1,1, new Kasila(2));
		s.getBloke(3).setKasila(1,2, new Kasila(6));
		s.getBloke(3).setKasila(2,0, new Kasila(7));
		s.getBloke(3).getKasila(2,0).setFinkoa(true);
		s.getBloke(3).setKasila(2,1, new Kasila(1));
		s.getBloke(3).setKasila(2,2, new Kasila(3));

		s.getBloke(4).setKasila(0,0, new Kasila(7));
		s.getBloke(4).setKasila(0,1, new Kasila(6));
		s.getBloke(4).getKasila(0,1).setFinkoa(true);
		s.getBloke(4).setKasila(0,2, new Kasila(1));
		s.getBloke(4).setKasila(1,0, new Kasila(8));
		s.getBloke(4).getKasila(1,0).setFinkoa(true);
		s.getBloke(4).setKasila(1,1, new Kasila(5));
		s.getBloke(4).setKasila(1,2, new Kasila(3));
		s.getBloke(4).getKasila(1,2).setFinkoa(true);
		s.getBloke(4).setKasila(2,0, new Kasila(9));
		s.getBloke(4).setKasila(2,1, new Kasila(2));
		s.getBloke(4).getKasila(2,1).setFinkoa(true);
		s.getBloke(4).setKasila(2,2, new Kasila(4));

		s.getBloke(5).setKasila(0,0, new Kasila(4));
		s.getBloke(5).setKasila(0,1, new Kasila(2));
		s.getBloke(5).setKasila(0,2, new Kasila(3));
		s.getBloke(5).getKasila(0,2).setFinkoa(true);
		s.getBloke(5).setKasila(1,0, new Kasila(7));
		s.getBloke(5).setKasila(1,1, new Kasila(9));
		s.getBloke(5).setKasila(1,2, new Kasila(1));
		s.getBloke(5).getKasila(1,2).setFinkoa(true);
		s.getBloke(5).setKasila(2,0, new Kasila(8));
		s.getBloke(5).setKasila(2,1, new Kasila(5));
		s.getBloke(5).setKasila(2,2, new Kasila(6));
		s.getBloke(5).getKasila(2,2).setFinkoa(true);

		s.getBloke(6).setKasila(0,0, new Kasila(9));
		s.getBloke(6).setKasila(0,1, new Kasila(6));
		s.getBloke(6).getKasila(0,1).setFinkoa(true);
		s.getBloke(6).setKasila(0,2, new Kasila(1));
		s.getBloke(6).setKasila(1,0, new Kasila(2));
		s.getBloke(6).setKasila(1,1, new Kasila(8));
		s.getBloke(6).setKasila(1,2, new Kasila(7));
		s.getBloke(6).setKasila(2,0, new Kasila(3));
		s.getBloke(6).setKasila(2,1, new Kasila(4));
		s.getBloke(6).setKasila(2,2, new Kasila(5));

		s.getBloke(7).setKasila(0,0, new Kasila(5));
		s.getBloke(7).setKasila(0,1, new Kasila(3));
		s.getBloke(7).setKasila(0,2, new Kasila(7));
		s.getBloke(7).setKasila(1,0, new Kasila(4));
		s.getBloke(7).getKasila(1,0).setFinkoa(true);
		s.getBloke(7).setKasila(1,1, new Kasila(1));
		s.getBloke(7).getKasila(1,1).setFinkoa(true);
		s.getBloke(7).setKasila(1,2, new Kasila(9));
		s.getBloke(7).getKasila(1,2).setFinkoa(true);
		s.getBloke(7).setKasila(2,0, new Kasila(2));
		s.getBloke(7).setKasila(2,1, new Kasila(8));
		s.getBloke(7).getKasila(2,1).setFinkoa(true);
		s.getBloke(7).setKasila(2,2, new Kasila(6));

		s.getBloke(8).setKasila(0,0, new Kasila(2));
		s.getBloke(8).getKasila(0,0).setFinkoa(true);
		s.getBloke(8).setKasila(0,1, new Kasila(8));
		s.getBloke(8).getKasila(0,1).setFinkoa(true);
		s.getBloke(8).setKasila(0,2, new Kasila(4));
		s.getBloke(8).setKasila(1,0, new Kasila(6));
		s.getBloke(8).setKasila(1,1, new Kasila(3));
		s.getBloke(8).setKasila(1,2, new Kasila(5));
		s.getBloke(8).getKasila(1,2).setFinkoa(true);
		s.getBloke(8).setKasila(2,0, new Kasila(1));
		s.getBloke(8).setKasila(2,1, new Kasila(7));
		s.getBloke(8).getKasila(2,1).setFinkoa(true);
		s.getBloke(8).setKasila(2,2, new Kasila(9));
		s.getBloke(8).getKasila(2,2).setFinkoa(true);

		s.inprimatuSudokuZuzena();

		try {
			ErabiltzaileLista.getErabiltzaileLista().kargatu();
			ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("erab", "qwerty");
			ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("erab", "qwerty").setSudoku(s);
			ErabiltzaileLista.getErabiltzaileLista().gorde();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
