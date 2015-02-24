package org.sudoku.sftwring;

public class Bloke {
	
	private Kasila [][] bloke;

	public Bloke() {
		bloke = new Kasila[3][3];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				bloke[i][j]=new Kasila();	 
			}
		}
	}
	
	
	public Bloke inprimatuBloke(){
		System.out.println(bloke[0][0].balioa+"   "+bloke[0][1].balioa+"   "+bloke[0][2].balioa+"   "+"\n");	
		System.out.println(bloke[1][0].balioa+"   "+bloke[1][1].balioa+"   "+bloke[1][2].balioa+"   "+"\n");
		System.out.println(bloke[2][0].balioa+"   "+bloke[2][1].balioa+"   "+bloke[2][2].balioa+"   "+"\n");
		return this;
	}
	public void aldatuKasila_(int pIndX,int pIndY,int pBalioBerria){
		bloke[pIndX][pIndX].balioa=pBalioBerria;
	}

}

