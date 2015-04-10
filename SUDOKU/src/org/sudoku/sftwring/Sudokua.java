package org.sudoku.sftwring;

import java.util.Stack;

public class Sudokua {
	private Bloke [][] sudoku;
	private int luzera = 3;
	private int zabalera = 3;
	
	public Sudokua() {
		sudoku = new Bloke[luzera][zabalera];
		beteZeroz();
	}

	public void inprimatuSudoku(){

		for (int i = 0; i < luzera; i++) {
			for (int j = 0; j < zabalera; j++) {
				sudoku[i][j].inprimatuBloke();;
			}
		}
	}
	
	public void inprimatuSudokuZuzena(){

		for (int i = 0; i < luzera; i++) {
			for (int j = 0; j < zabalera; j++) {
				sudoku[i][j].inprimatuBlokeZuzen();
			}
		}
	}
	
	public Sudokua erreseteatuSudoku(){
		//Aurre:
		//Post:Sudokua hasieratuko du
		Sudokua sudokuBerria= new Sudokua();
		return  sudokuBerria;	
	}


	public String gorde(){
		//Aurre:
		//Post:Sudokua String batetara pasako da.
		String emaitza="";
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				emaitza=emaitza+sudoku[j][k].gorde();
				emaitza=emaitza+"/";
			}
		}
		return emaitza;
	}

	public void kargatu(String pSudoku){
		//Aurre: pSudoku String-a sudoku bat betetzeko behar beste zenbakiz egongo da beteta.
		//Post: Sudokua zenbakiz beteko da.
		if(!pSudoku.equals("")){
			String[] arrayString=pSudoku.split("/");
			int cont=0;
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					sudoku[j][k].kargatu(arrayString[cont]);
					cont++;
				}
			}
		}else beteZeroz();
	}

	public void beteZeroz(){
		//Aurre:
		//Post:Sudokua 0roz beteko du.
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				sudoku[i][j]=new Bloke();	 
			}
		}
	}

	public void ausazBete() {
		Stack<Integer> sudokuBidea = new Stack<Integer>(); // sudokua egiten gaudela atzera egiteko erabiliko dugu

		for (int blokeI = 0; blokeI < luzera; blokeI++) {
			for (int blokeJ = 0; blokeJ < zabalera; blokeJ++) {
				for (int i = 0; i < sudoku[blokeI][blokeJ].getLuzera(); i++) {
					for (int j = 0; j < sudoku[blokeI][blokeJ].getZabalera(); j++) {
						
						int balioa = sudoku[blokeI][blokeJ].blokekoKasilaAusazEditatu(i, j);
						if (balioa!=-1){
							sudokuBidea.push(balioa);
							errenkadaEzgaitu(blokeI, blokeJ, i, j, balioa);
							zutabeaEzgaitu(blokeI, blokeJ, i, j, balioa);
							blokeaEzgaitu(blokeI, blokeJ, balioa);
						}
						else {/*sudokuBidean atzera joan eta balioak erreseteatuz joan ahala
						bloke errenkada eta zutabeetako posibleak eguneratu*/}
					}
				}
			}
		}
	}
	
	public void errenkadaEzgaitu(int pBlokeI, int pBlokeJ, int pI, int pJ, int balioa){
		for(int blokeI=0; blokeI < luzera; blokeI++){//errenkadako hiru blokeak erabili behar dira
			for (int i = 0; i < sudoku[pBlokeI][pBlokeJ].getLuzera(); i++) {
				sudoku[blokeI][pBlokeJ].kasilaZenbPosibleaEzgaitu(i, pJ, balioa);
			}
		}
	}
	
	public void zutabeaEzgaitu(int pBlokeI, int pBlokeJ, int pI, int pJ, int balioa){
		for(int blokeJ=0; blokeJ < luzera; blokeJ++){//zutabeko hiru blokeak erabili behar dira
			for (int j = 0; j < sudoku[pBlokeI][pBlokeJ].getLuzera();j++) {
				sudoku[pBlokeI][blokeJ].kasilaZenbPosibleaEzgaitu(pI, j, balioa);
			}
		}
	}
	
	public void blokeaEzgaitu(int pBlokeI, int pBlokeJ, int balioa){
		for (int i = 0; i < sudoku[pBlokeI][pBlokeJ].getLuzera();i++) {
			for (int j = 0; j < sudoku[pBlokeI][pBlokeJ].getZabalera(); j++) {
				sudoku[pBlokeI][pBlokeJ].kasilaZenbPosibleaEzgaitu(i, j, balioa);
			}
		}
	}













	//		return s;
	//	}
	//	private boolean posibleX(S pSudoku,int errenkada,int zenb){
	//		boolean posible=true;
	//		for (int i=0;i<9;i++)
	//			if(pSudoku.blokeZerrenda[errenkada].kasilaZerrenda[i].balioa==zenb)
	//				posible=false;
	//		return posible;
	//
	//
	//	}
	//	private boolean posibleY(S pSudoku,int zutabe,int zenb){
	//		boolean posible=true;
	//		for (int i=0;i<9;i++)
	//			if(pSudoku.blokeZerrenda[i].kasilaZerrenda[zutabe].balioa==zenb)
	//				posible=false;
	//		return posible;
	//
	//
	//	}
	//	private int sortuX(){
	//		Random ausazkoZenbaki = new Random();
	//		int hasX= ausazkoZenbaki.nextInt(9);
	//		return hasX;
	//	}
	//	private int sortuY(){
	//		Random ausazkoZenbaki = new Random();
	//		int hasY= ausazkoZenbaki.nextInt(9);
	//		return hasY;
	//	}
}


