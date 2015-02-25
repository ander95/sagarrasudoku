package org.sudoku.sftwring;

public class ProbatzekoMain {

	public static void main(String[] args) {
		
		blokearenProba();
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

}
