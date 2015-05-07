package org.sudoku.sftwring;

import java.util.Random;

/**
 * Solves a sudoku puzzle by recursion and backtracking
 */
public class SudokuSolver
{
	/** The model */
	protected int model[][] ;

	/** Creates the model and sets up the initial situation */
	protected void createModel(int[][] sudo)
	{
		model = new int[9][9] ;

		model = sudo;
	}

	public int[][] getModel() {
		return model;
	}

	/** This method is called by the browser when the applet is loaded */
	public void init(int[][] sudo)
	{
		createModel(sudo);
	}

	private void shuffle(Integer[] zerrenda){	//Integer[] motako zerrenda nahasten du 
		Random ausa = new Random();
		for (int i = zerrenda.length-1; i > 0; i--) {
			int indize = ausa.nextInt(i+1);
			if (indize!=i) {
				int balioa = zerrenda[indize];
				zerrenda[indize] = zerrenda [i];
				zerrenda[i] = balioa;
			}
		}
	}

	/** Checks if num is an acceptable value for the given row */
	protected boolean checkRow( int row, int num )
	{
		for( int col = 0; col < 9; col++ )
			if( model[row][col] == num )
				return false ;

		return true ;
	}

	/** Checks if num is an acceptable value for the given column */
	protected boolean checkCol( int col, int num )
	{
		for( int row = 0; row < 9; row++ )
			if( model[row][col] == num )
				return false ;

		return true ;
	}

	/** Checks if num is an acceptable value for the box around row and col */
	protected boolean checkBox( int row, int col, int num )
	{
		row = (row / 3) * 3 ;
		col = (col / 3) * 3 ;

		for( int r = 0; r < 3; r++ )
			for( int c = 0; c < 3; c++ )
				if( model[row+r][col+c] == num )
					return false ;

		return true ;
	}


	/** The active part begins here */
	public boolean run()
	{
		try
		{
			// Let the observers see the initial position
			//Thread.sleep( 1000 ) ;

			// Start to solve the puzzle in the left upper corner
			solve( 0, 0 ) ;
			return false;
		}
		catch( Exception e )
		{
			System.out.println("solution");
			return true;
		}
	}

	/** Recursive function to find a valid number for one single cell */
	public void solve( int row, int col ) throws Exception
	{
		// Throw an exception to stop the process if the puzzle is solved
		if( row > 8 )
			throw new Exception( "Solution found" ) ;

		// If the cell is not empty, continue with the next cell
		if( model[row][col] != 0 )
			next( row, col ) ;
		else
		{
			Integer[]posible={1,2,3,4,5,6,7,8,9};
			shuffle(posible);

			// Find a valid number for the empty cell
			for( int num = 0; num < 9; num++ )
			{
				if( checkRow(row,posible[num]) && checkCol(col,posible[num]) && checkBox(row,col,posible[num]) )
				{
					model[row][col] = posible[num] ;

					// Let the observer see it
					//Thread.sleep( 1000 ) ;

					// Delegate work on the next cell to a recursive call
					next( row, col ) ;
				}
			}

			// No valid number was found, clean up and return to caller
			model[row][col] = 0 ;
		}
	}

	/** Calls solve for the next cell */
	public void next( int row, int col ) throws Exception
	{
		if( col < 8 )
			solve( row, col + 1 ) ;
		else
			solve( row + 1, 0 ) ;
	}

	public void print() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" "+model[i][j]);
			}
			System.out.println();
		}
	}
}
