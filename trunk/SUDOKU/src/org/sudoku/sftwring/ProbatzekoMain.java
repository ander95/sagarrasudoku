package org.sudoku.sftwring;




public class ProbatzekoMain {

	public static void main(String[] args) {
		
		blokearenProba();
		sudokuarenProba();
		ListaErabiltzaileenProba();
	}
	
	private static void blokearenProba() {
		Bloke b=new Bloke();

		b.inprimatuBloke();

	}
	private static void sudokuarenProba() {
		Sudokua s=new Sudokua();
		s.inprimatuSudoku();

	}
	private static void ListaErabiltzaileenProba() {
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Mikel","kkkk");
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","llll");
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkk").inprimatuDatuak();
		 ErabiltzaileLista.getErabiltzaileLista().ezabatuErabiltzaile(ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkk"));;
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","llll");
	}
}
