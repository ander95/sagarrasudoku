package org.sudoku.sftwring;

public class Main {

	public static void main(String[] args) {
		SudokuGenerator s = new SudokuGenerator();
		int[][] game = new int[9][9];
		s.generateSolution(game, 0);
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print(game[i][j]+" ");
			}System.out.print("\n");
		}
	}

}
