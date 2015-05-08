package org.sudoku.sftwring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SudokuGenerator {
	public SudokuGenerator() {

	}
	public  int[][] generateSolution(int[][] game, int index) {
		if (index > 80)
			return game;

		int x = index % 9;
		int y = index / 9;

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++)
			numbers.add(i);
		Collections.shuffle(numbers);

		while (numbers.size() > 0) {
			int number = getNextPossibleNumber(game, x, y, numbers);
			if (number == -1)
				return null;

			game[y][x] = number;
			int[][] tmpGame = generateSolution(game, index + 1);
			if (tmpGame != null)
				return tmpGame;
			game[y][x] = 0;
		}

		return null;
	}
	private int getNextPossibleNumber(int[][] game, int x, int y, List<Integer> numbers) {
		while (numbers.size() > 0) {
			int number = numbers.remove(0);
			System.out.println();
			if (isPossibleX(game, y, number)
					&& isPossibleY(game, x, number)
					&& isPossibleBlock(game, x, y, number))
				return number;
		}
		return -1;
	}

	private boolean isPossibleBlock(int[][] game, int x, int y, int number) {

		boolean emaitza=true;
		if(x<3&&y<3){
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(game[i][j]==number){
						emaitza=false;
					}
				}

			}			
		}
		if(2<y && y<6 && x<3){
			for (int i = 3; i < 6; i++) {
				for (int j = 0; j < 3; j++) {
					if(game[i][j]==number){
						return false;
					}


				}

			}			
		}
		//		if(x>4 && y<3){
		//			for (int i =4 ; i < 6; i++) {
		//				for (int j = 0; j < 3; j++) {
		//					if(game[j][i]==number){
		//						emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		if(x<3 && y>2 && y<6){
		//			for (int i = 0; i < 3; i++) {
		//				for (int j = 3; j < 6; j++) {
		//					if(game[i][j]==number){
		//						emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		if(x>2 && x<6 && y>2 && y<6){
		//			for (int i = 3; i < 6; i++) {
		//				for (int j = 3; j < 6; j++) {
		//					if(game[i][j]==number){
		//						emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		if(x>6 && y>2&&y<6){
		//			for (int i = 6; i < 9; i++) {
		//				for (int j = 3; j < 6; j++) {
		//					if(game[i][j]==number){
		//						emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		if(x<3&&y>6){
		//			for (int i = 0; i < 3; i++) {
		//				for (int j = 6; j < 9; j++) {
		//					if(game[i][j]==number){
		//						emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		if(x>2 && x<6 && y>6){
		//			for (int i = 3; i < 6; i++) {
		//				for (int j = 6; j < 9; j++) {
		//					if(game[i][j]==number){
		//						emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		if(x>5 && y>5){
		//			for (int i = 6; i < 9; i++) {
		//				for (int j = 6; j < 9; j++) {
		//					if(game[i][j]==number){
		//				emaitza= false;
		//					}
		//				}
		//				
		//			}			
		//		}
		//		
		return emaitza;
	}
	private boolean isPossibleY(int[][] game, int x, int number) {
		boolean emaitza=true;
		for (int i = 0; i < 9; i++) {
			if (game[i][x]==number){
				emaitza= false;}			}

		return emaitza;		

	}
	private boolean isPossibleX(int[][] game, int y, int number) {
		boolean emaitza=true;
		for (int i = 0; i < 9; i++) {
			if (game[y][i]==number){
				emaitza= false;}			}

		return emaitza;	

	}

}

