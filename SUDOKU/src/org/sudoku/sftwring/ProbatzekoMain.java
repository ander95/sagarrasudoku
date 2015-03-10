package org.sudoku.sftwring;




public class ProbatzekoMain {

	public static void main(String[] args) {
		
		blokearenProba();
		ListaErabiltzaileenProba();
	}
	
	private static void blokearenProba() {
		Bloke b=new Bloke();
		b.aldatuKasila_(0,0, 1);
		b.aldatuKasila_(1,2, 1);
		b.aldatuKasila_(2,2, 1);
		b.inprimatuBloke();

	}
	private static void sudokuarenProba() {
		Sudokua s=new Sudokua();
		s.inprimatuSudoku();

	}
	private static void ListaErabiltzaileenProba() {
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Mikel","Ocejo","kkkk");
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","Zumarraga","llll");
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkk").inprimatuDatuak();
		 ErabiltzaileLista.getErabiltzaileLista().ezabatuErabiltzaile(ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkk"));;
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","Zumarraga","llll");
	}
}
