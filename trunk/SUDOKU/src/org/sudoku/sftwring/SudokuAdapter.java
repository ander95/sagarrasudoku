package org.sudoku.sftwring;

public class SudokuAdapter extends Sudokua {

	public SudokuAdapter() {
		super();
	}

	public void ausazBete() {
		GeneradoreSudoku genSudo = new GeneradoreSudoku();
		//zailtasuna hemen nonbaiten doa generadoreko zenbakiak kentzeko metodoak 0, 1 edo 2 zenbalia beharko duelako
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
