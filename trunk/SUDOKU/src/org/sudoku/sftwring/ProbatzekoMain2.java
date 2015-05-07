package org.sudoku.sftwring;

public class ProbatzekoMain2 {

	public static void main(String[] args) {
//		sudokuaAusazBete();
		proba();

	}
	
	private static void proba(){
		GeneradoreSudoku s = new GeneradoreSudoku(0);
		s.beteAusaz();
		s.setZailtasuna(0);
		s.kasilakEzabatu(0);
		s.inprimatuZuzena();
		s.inprimatuErabiltzaile();
	}
	
	@SuppressWarnings("unused")
	private static void sudokuaAusazBete() {
		
		//GeneradoreSudoku s = new GeneradoreSudoku();
		Sudokua s = new SudokuAdapter();
		System.out.println("\nHasieran...\n");
		//s.beteAusaz();
		s.ausazBete(0);
	
		System.out.println("\nAusaz bete ondoren...\n");
//		s.inprimatuSudokuZuzena();
		
		s.inprimatuSudoku();
		//s.inprimatuZuzena();
	}
}
