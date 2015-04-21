package org.sudoku.sftwring;

public class ProbatzekoMain2 {

	public static void main(String[] args) {
		sudokuaAusazBete();

	}
	
	private static void sudokuaAusazBete() {
		Sudokua s = new Sudokua();
		System.out.println("\nHasieran...\n");
		s.inprimatuSudokuZuzena();
		s.bete();
		System.out.println("\nAusaz bete ondoren...\n");
		s.inprimatuSudokuZuzena();
	}
}
