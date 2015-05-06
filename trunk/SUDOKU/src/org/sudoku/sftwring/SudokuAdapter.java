package org.sudoku.sftwring;

public class SudokuAdapter extends Sudokua {

	public SudokuAdapter(int i) {
		super();
	}

	public void ausazBete(int i) {
		GeneradoreSudoku genSudo = new GeneradoreSudoku(i);
		genSudo.beteAusaz();
		pasatu(genSudo);
	}
	
	private void pasatu(GeneradoreSudoku pGenSudo){

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				this.setKasila(i, j, pGenSudo.getSudokuKasila(i, j));
			}
		}
	}
}
