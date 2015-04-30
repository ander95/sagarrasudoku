package org.sudoku.sftwring;

public class ProbatzekoMain2 {

	public static void main(String[] args) {
		sudokuaAusazBete();

	}
	
	private static void sudokuaAusazBete() {
		
		//GeneradoreSudoku s = new GeneradoreSudoku();
		Sudokua s = new SudokuAdapter();
		System.out.println("\nHasieran...\n");
		//s.beteAusaz();
		s.ausazBete();
		System.out.println("\nAusaz bete ondoren...\n");
		s.inprimatuSudokuZuzena();
		
		s.inprimatuSudoku();
		//s.inprimatuZuzena();
	}
}
