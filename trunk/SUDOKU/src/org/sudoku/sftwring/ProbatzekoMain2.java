package org.sudoku.sftwring;

public class ProbatzekoMain2 {

	public static void main(String[] args) {
		sudokuaAusazBete();

	}
	
	private static void sudokuaAusazBete() {
		GeneradoreSudoku s = new GeneradoreSudoku();
		System.out.println("\nHasieran...\n");
		s.beteAusaz();
		System.out.println("\nAusaz bete ondoren...\n");
		s.inprimatuZuzena();
	}
}
