package org.sudoku.sftwring;

public class Adapter {
	
	private static Adapter nAdapter;
	
	private Adapter() {}
	
	public static Adapter getAdapter() {
		if (nAdapter==null) nAdapter = new Adapter();
		return nAdapter;
	}
	
	public Sudokua sudokuaGeneratu() {
		
		Sudokua sudo = new Sudokua();
		
		GeneradoreSudoku genSudo = new GeneradoreSudoku();
		
		genSudo.beteAusaz();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				//sudo.getBloke(i)!!!
			}
		}
	}
}
