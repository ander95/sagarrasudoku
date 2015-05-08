package org.sudoku.sftwring;

import java.util.ArrayList;
import java.util.Collections;

public class ProbatzekoMain2 {

	public static void main(String[] args) {
		sudokuaAusazBete();
		//		proba();

	}

	private static void proba(){

		GeneradoreSudoku s = new GeneradoreSudoku(0);
		ArrayList posizioak = new ArrayList(81);
		for (int i = 0; i < posizioak.size(); i++) {
			posizioak.add(i);
		}
		Collections.shuffle(posizioak);
		for (Object i : posizioak) {
			int unekoPosizioa=(int) posizioak.get((int) i);
			if(s.KalkulatuPosibleak(unekoPosizioa).length>1){

			}else{

			}
		}

		GeneradoreSudoku s1 = new GeneradoreSudoku(0);

		s1.beteAusaz();
		s1.setZailtasuna(0);
		s1.kasilakEzabatu(0);
		s1.inprimatuZuzena();
		s1.inprimatuErabiltzaile();
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
