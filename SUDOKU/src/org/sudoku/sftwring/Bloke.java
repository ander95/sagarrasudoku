package org.sudoku.sftwring;

public class Bloke {
	
	private Kasila [][] bloke;

	public Bloke() {
		bloke = new Kasila[3][3];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				bloke[i][j]=new Kasila(0);	 
			}
		}
	}
	
	
	public void inprimatuBloke(){
		for (int i = 0; i < bloke.length; i++) {
			for (int j = 0; j < bloke[i].length; j++) {
				System.out.println(bloke[i][j].getErabiltzaileBal());
			}
		}
		
	}


}

